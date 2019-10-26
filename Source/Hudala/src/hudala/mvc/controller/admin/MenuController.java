package hudala.mvc.controller.admin;

import java.util.List;

import hudala.mvc.dto.InboxDto;
import hudala.mvc.dto.MenuDto;
import hudala.mvc.model.bean.User;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.service.FeedBackService;
import hudala.mvc.model.service.GuestService;

public class MenuController {

	public static MenuDto getMenu(ConnectionPool cp) {
		GuestService guestService = new GuestService(cp);
		FeedBackService feedBackService = new FeedBackService(cp);	
		User adminInfo = guestService.getAdminInfo();
		int messageCounter = feedBackService.countMessage();
		List<InboxDto> inbox = feedBackService.getTop3FeedBack();
		MenuDto menu = new MenuDto(adminInfo.getImage(), adminInfo.getFullName(), messageCounter, inbox);
		return menu;
	}

}
