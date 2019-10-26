package hudala.mvc.model.bean;

import java.util.Date;

public class User {
	protected String fullName;
	protected Date birth;
	protected String image;
	protected boolean gender;
	protected String phone;
	protected String email;
	protected String job;
	protected String link;
	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", birth=" + birth + ", image=" + image + ", gender=" + gender
				+ ", phone=" + phone + ", email=" + email + ", link=" + link + "]";
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getFullName() {
		return fullName;
	}
	public User(String fullName, Date birth, String image, boolean gender, String phone, String email, String link) {
		super();
		this.fullName = fullName;
		this.birth = birth;
		this.image = image;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.link = link;
	}
	
	public User(String fullName, Date birth, String image, boolean gender, String phone, String email, String job,
			String link) {
		super();
		this.fullName = fullName;
		this.birth = birth;
		this.image = image;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.job = job;
		this.link = link;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirth() {
		return birth;
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
	
}
