package hudala.mvc.dto;

public class InboxDto {
	private String sentTime; // thoi gian gui(2' truoc, 3' truoc,...)
	private String linkImage; // link anh nguoi gui
	private String guestName; // ten nguoi dung
	public String getSentTime() {
		return sentTime;
	}
	public void setSentTime(String sentTime) {
		this.sentTime = sentTime;
	}
	@Override
	public String toString() {
		return "InboxDto [sentTime=" + sentTime + ", linkImage=" + linkImage + ", guestName=" + guestName + ", content="
				+ content + "]";
	}
	public String getLinkImage() {
		return linkImage;
	}
	public InboxDto(String sentTime, String linkImage, String guestName, String content) {
		super();
		this.sentTime = sentTime;
		this.linkImage = linkImage;
		this.guestName = guestName;
		this.content = content;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String content; // noi dung thu gon
}
