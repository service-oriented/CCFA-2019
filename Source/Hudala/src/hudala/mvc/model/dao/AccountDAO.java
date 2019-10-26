package hudala.mvc.model.dao;

import java.sql.ResultSet;
import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.Guest;

public interface AccountDAO extends ShareControl{
	
	ResultSet getAdminAccount();
	
	ResultSet getAllUserAccount();	
	
	//kiem tra tai khoan
		public ResultSet checkAccount(String username, String password, boolean  status);
		//lay thong tin tai khoan
		public ResultSet getAccount(String username, String password);
		
		//them mot tai khoan
		public boolean addAccount(Account item);	
		//kiem tra username da ton tai chua
		public ResultSet checkUsername(String username);
		//them mot khach hang
		public boolean addGuest(Guest guest);
		
		//xoa khach hang
		public boolean deleteGuest(long accountId);
	}
