package hudala.mvc.model.bean;

import java.util.Date;

public class Answer extends Message{
	
	private long answerId;
	private Date replyTime;
	public Answer(String title, String content, long answerId, Date replyTime, long feedbackId) {
		super(title, content);
		this.answerId = answerId;
		this.replyTime = replyTime;
		this.feedbackId = feedbackId;
	}
	public long getAnswerId() {
		return answerId;
	}
	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}
	private long feedbackId;
}
