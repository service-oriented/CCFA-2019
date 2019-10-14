package hudala.mvc.model.bean;

import java.util.Date;

public class User {
	protected String fullName;
	protected Date birth;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirth() {
		return birth;
	}
	public User(String fullName, Date birth, boolean gender, String phone, String email, String job, String link) {
		super();
		this.fullName = fullName;
		this.birth = birth;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.job = job;
		this.link = link;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	protected boolean gender;
	protected String phone;
	protected String email;
	protected String job;
	protected String link;
}
