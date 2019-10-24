package hudala.mvc.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hudala.mvc.dto.InboxDto;
import hudala.mvc.dto.MenuDto;
import hudala.mvc.model.bean.User;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.service.AccountService;
import hudala.mvc.model.service.FeedBackService;
import hudala.mvc.model.service.GuestService;

@WebServlet("/admin/home")
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute("CPool");
		AccountService accountService = new AccountService(cp);
		if (cp == null) {
			getServletContext().setAttribute("CPool", accountService.getCP());
		}
		
		GuestService guestService = new GuestService(cp);
		FeedBackService feedBackService = new FeedBackService(cp);
		
		User adminInfo = guestService.getAdminInfo();
		int messageCounter = feedBackService.countMessage();
		List<InboxDto> inbox = feedBackService.getTop3FeedBack();
		System.out.println(inbox.get(0).getSentTime());
		MenuDto menu = new MenuDto(adminInfo.getImage(), adminInfo.getFullName(), messageCounter, inbox);
		req.setAttribute("menu", menu);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/home.jsp");
		requestDispatcher.forward(req, resp);
	}

}
