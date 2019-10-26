package hudala.mvc.model.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.dao.AccountDAO;
import hudala.mvc.model.dao.AccountDAOImpl;
import hudala.mvc.model.dao.ConnectionPool;
import java.util.ArrayList;

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
	
	//THAO-TAC-DANG-NHAP
		//kiem tra xem tai khoan da ton tai chua
		public boolean checkAccount(String username, String password, boolean status) {		
			
				ArrayList<Account> items = new ArrayList<Account>();
				Account item = null;
				ResultSet rs = this.accountDao.checkAccount(username, password, status);		
				if(rs!=null) {
					try {
						while(rs.next()) {
							item = new Account();
							item.setAccountId(rs.getInt("accountId"));						
							item.setUsername(rs.getString("username"));
							item.setPassword(rs.getString("password"));
							item.setStatus(rs.getBoolean("status"));
							item.setRole(rs.getBoolean("role"));							
							items.add(item);
							
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			if(items.size()!=0)
			return true;
			else return false;		
		}

		//lay thong tin cua tai khoan
		public Account getAccount(String username, String password) {
			
			ResultSet rs = this.accountDao.getAccount(username, password);	
			try {
				while(rs.next()) {
					
						boolean status=rs.getBoolean("status");
						boolean role=rs.getBoolean("role");
						long accountId=rs.getLong("accountId");
						
						return new Account(accountId,username,password,status,role);
									
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		//lay accountid cua mot tai khoan
		public long getAccountId(String username, String password) {
			
			ResultSet rs = this.accountDao.getAccount(username, password);	
			try {
				while(rs.next()) {				
						long accountId=rs.getLong("accountId");					
						return accountId;								
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
		
		//THAO-TAC-DANG-KY
		//kiem tra username da ton tai hay chua
		public boolean checkUsername(String username) {
			ArrayList<Account> items = new ArrayList<Account>();
			Account item = null;
			ResultSet rs = this.accountDao.checkUsername(username);		
			if(rs!=null) {
				try {
					while(rs.next()) {
						item = new Account();
						item.setAccountId(rs.getInt("accountId"));						
						item.setUsername(rs.getString("username"));
						item.setPassword(rs.getString("password"));
						item.setStatus(rs.getBoolean("status"));
						item.setRole(rs.getBoolean("role"));					
						items.add(item);
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				if(items.size()==1)
				return true;
				else return false;		
		}
		//them mot tai khoan
		public boolean addAccount(Account item) {
			String username=item.getUsername();
			//kiem tra neu username la duy nhat
			if(checkUsername(username)!=true) {
				return this.accountDao.addAccount(item);			
			}
			else {
				System.out.println("Ten dang nhap da ton tai");
				return false;
			}		
		}
		//xoa 
		public boolean deleteGuest(long accountId) {
			return this.accountDao.deleteGuest(accountId);
		}
		
}
