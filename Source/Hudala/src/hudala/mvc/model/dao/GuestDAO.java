package hudala.mvc.model.dao;

import java.sql.ResultSet;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.Guest;


public interface GuestDAO extends ShareControl{
	
	ResultSet getAdminInfo();
	
	ResultSet getUserInfo(long accountId);
	
	public boolean addGuest(Guest guest);
	
	//lay khach hang dua va accountid
	public ResultSet getGuest(long accountId);
	//sua mot khach hang
	public boolean updateGuest(Guest guest);
	
	//xoa khach hang
	public boolean deleteGuest(Guest guest);
}
