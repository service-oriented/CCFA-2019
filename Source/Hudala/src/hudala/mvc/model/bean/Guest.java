package hudala.mvc.model.bean;

import java.util.Date;

public class Guest extends User{

	public Guest(String fullName, Date birth, String image, boolean gender, String phone, String email, String job,
			String link) {
		super(fullName, birth, image, gender, phone, email, job, link);
		// TODO Auto-generated constructor stub
	}
	private long guestId;
	public long getGuestId() {
		return guestId;
	}
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", weight=" + weight + ", height=" + height + ", body=" + body
				+ ", hairColor=" + hairColor + ", skinColor=" + skinColor + ", lipThickness=" + lipThickness
				+ ", faceShape=" + faceShape + ", favorite=" + favorite + ", accountId=" + accountId + "]";
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getLipThickness() {
		return lipThickness;
	}
	public void setLipThickness(String lipThickness) {
		this.lipThickness = lipThickness;
	}
	public String getFaceShape() {
		return faceShape;
	}
	public void setFaceShape(String faceShape) {
		this.faceShape = faceShape;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	private float weight;
	private float height;
	private String body;
	private String hairColor;
	private String skinColor;
	private String lipThickness;
	private String faceShape;
	private String favorite;
	private long accountId;
}
