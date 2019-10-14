package hudala.mvc.dto;

import java.util.Date;

public class InboxDto {
	private Date  sentTime;
	private String linkImage;
	public InboxDto(Date sentTime, String linkImage, String titleTop) {
		super();
		this.sentTime = sentTime;
		this.linkImage = linkImage;
		this.titleTop = titleTop;
	}
	public Date getSentTime() {
		return sentTime;
	}
	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}
	public String getLinkImage() {
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	public String getTitleTop() {
		return titleTop;
	}
	public void setTitleTop(String titleTop) {
		this.titleTop = titleTop;
	}
	private String titleTop;
}
