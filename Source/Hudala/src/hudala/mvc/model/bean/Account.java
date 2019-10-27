package hudala.mvc.model.bean;

public class Account {

	private long accountId;
	private String username;
	private String password;
	private boolean role;
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", username=" + username + ", password=" + password + ", role="
				+ role + ", status=" + status + "]";
	}
	private boolean status;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public Account() {
		super();
	}
	public Account(long accountId, String username, String password, boolean role, boolean status) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.status = status;
	}
	public Account(long accountId, String username, boolean status) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
