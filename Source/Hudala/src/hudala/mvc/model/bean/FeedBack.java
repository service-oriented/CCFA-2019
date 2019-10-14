package hudala.mvc.model.bean;

import java.util.Date;

public class FeedBack extends Message{
	public FeedBack(String title, String content, long feedbackId, Date sentTime, boolean status) {
		super(title, content);
		this.feedbackId = feedbackId;
		this.sentTime = sentTime;
		this.status = status;
	}
	private long feedbackId;
	private Date sentTime;
	private boolean status;
	public long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}
	public Date getSentTime() {
		return sentTime;
	}
	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
