package hudala.mvc.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hudala.mvc.common.BasicImpl;
import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.Guest;

public class AccountDAOImpl extends BasicImpl implements AccountDAO {

	public AccountDAOImpl(ConnectionPool cp) {
		super(cp, "Account");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getAdminAccount() {
		String sql = "select * from ccfa.account where role = ?";
		return this.get(sql, 1);// tai khoan role = 1
	}

	@Override
	public ResultSet getAllUserAccount() {
		String sql = "select * from ccfa.account where role = 0";
		return this.gets(sql);// tai khoan role = 0
	}

	@Override
	public ResultSet checkAccount(String username, String password, boolean status, boolean role) {
		String sql = "SELECT * FROM account where username=? AND password=? AND status=? AND role=?";
		return this.get(sql, username, password, status, role);
	}

	@Override
	public ResultSet getAccount(String username, String password) {
		String sql = "SELECT * FROM account where username=? AND password=?";
		return this.get(sql, username, password);
	}

	@Override
	public boolean addAccount(Account item) {
		String sql = "INSERT INTO account(username,password,status,role) values(?,?,?,? )";

		try {
			PreparedStatement pre = this.con.prepareStatement(sql);
			pre.setString(1, item.getUsername());
			pre.setString(2, item.getPassword());
			pre.setBoolean(3, item.isStatus());
			pre.setBoolean(4, item.isRole());
			return this.add(pre);
		} catch (SQLException e) {
			System.out.println("Khong them duoc");
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public ResultSet checkUsername(String username) {
		String sql = "SELECT * FROM account where username=? ";
		return this.get(sql, username);
	}

	@Override
	public boolean addGuest(Guest guest) {
		String sql = "INSERT INTO guest(fullname,accountId) VALUES(?,?)";
		try {
			PreparedStatement pre = this.con.prepareStatement(sql);
			pre.setString(1, guest.getFullName());
			pre.setLong(2, guest.getAccountId());
			return this.add(pre);
		} catch (SQLException e) {
			System.out.println("Khong them duoc");
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean deleteGuest(long accountId) {
		String sql = "UPDATE account a Join guest g ON a.accountId=g.accountId set status=0 where a.accountId=?";
		try {
			PreparedStatement pre = this.con.prepareStatement(sql);
			pre.setLong(1, accountId);
			return this.add(pre);
		} catch (SQLException e) {
			System.out.println("Khong them duoc");
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean changeStatusAcccount(boolean status,long accountId) {
		String sql = "update ccfa.account set status = ? where accountId = ? and role = 0";
		try {
			PreparedStatement pre = this.con.prepareStatement(sql);
			pre.setBoolean(1, status);
			pre.setLong(2, accountId);
			return this.edit(pre);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
