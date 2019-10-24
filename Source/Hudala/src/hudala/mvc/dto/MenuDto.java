package hudala.mvc.dto;

import java.util.List;

public class MenuDto {
	
	private String linkImage;
	@Override
	public String toString() {
		return "MenuDto [linkImage=" + linkImage + ", adminName=" + adminName + ", messageCounter=" + messageCounter
				+ ", feedBack=" + feedBack + "]";
	}
	private String adminName;
	private int messageCounter;
	private List<InboxDto> feedBack;
	
	public MenuDto(String linkImage, String adminName, int messageCounter, List<InboxDto> feedBack) {
		super();
		this.linkImage = linkImage;
		this.adminName = adminName;
		this.messageCounter = messageCounter;
		this.feedBack = feedBack;
	}
	public String getLinkImage() {
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	public void setFeedBack(List<InboxDto> feedBack) {
		this.feedBack = feedBack;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getMessageCounter() {
		return messageCounter;
	}
	public void setMessageCounter(int messageCounter) {
		this.messageCounter = messageCounter;
	}
	public List<InboxDto> getFeedBack() {
		return feedBack;
	}
	public void setfeedBack(List<InboxDto> feedBack) {
		this.feedBack = feedBack;
	} 
}
