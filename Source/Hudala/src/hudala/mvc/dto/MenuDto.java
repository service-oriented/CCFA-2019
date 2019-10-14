package hudala.mvc.dto;

import java.util.List;

public class MenuDto {
	private String linkImageAdminProfile;
	private String adminName;
	private int messageCounter;
	private List<InboxDto> feedBackTop3;
	public MenuDto(String linkImageAdminProfile, String adminName, int messageCounter, List<InboxDto> feedBackTop3) {
		super();
		this.linkImageAdminProfile = linkImageAdminProfile;
		this.adminName = adminName;
		this.messageCounter = messageCounter;
		this.feedBackTop3 = feedBackTop3;
	}
	public String getLinkImageAdminProfile() {
		return linkImageAdminProfile;
	}
	public void setLinkImageAdminProfile(String linkImageAdminProfile) {
		this.linkImageAdminProfile = linkImageAdminProfile;
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
	public List<InboxDto> getFeedBackTop3() {
		return feedBackTop3;
	}
	public void setFeedBackTop3(List<InboxDto> feedBackTop3) {
		this.feedBackTop3 = feedBackTop3;
	} 
}
