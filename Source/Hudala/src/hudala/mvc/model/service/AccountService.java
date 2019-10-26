package hudala.mvc.model.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.dao.AccountDAO;
import hudala.mvc.model.dao.AccountDAOImpl;
import hudala.mvc.model.dao.ConnectionPool;

public class AccountService {

	private AccountDAO accountDao;

	public AccountService(ConnectionPool cp) {
		accountDao = new AccountDAOImpl(cp);
	}
	
	public void finalize() throws Throwable{
		this.accountDao = null;
		super.finalize();
	}
	
	public ConnectionPool getCP() {
		return this.accountDao.getCP();
	}
	
	public void releaseConnection() {
		this.accountDao.releaseConnection();
	}
	
	public Account getAdminAccount() {
		Account adminAccount = null;
		ResultSet rs = accountDao.getAdminAccount();
		if(rs!=null) {
			try {
				while(rs.next()) {
					adminAccount = new Account(rs.getLong("accountId"), rs.getString("username"), 
							rs.getString("password"), rs.getBoolean("role"), rs.getBoolean("status"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return adminAccount;
	}
	
	public List<Account> getAllUserAccount(){
		List<Account> listUserAccount = new ArrayList<>(); 
		ResultSet rs = accountDao.getAllUserAccount();
		if(rs!=null) {
			try {
				while(rs.next()) {
					listUserAccount.add(new Account(rs.getLong("accountId"), rs.getString("username"), rs.getBoolean("status")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listUserAccount;
	}
}
