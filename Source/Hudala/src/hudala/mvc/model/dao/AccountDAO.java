package hudala.mvc.model.dao;

import java.sql.ResultSet;

public interface AccountDAO extends ShareControl{
	
	public ResultSet getAdminAccount();
	
	public ResultSet getAllUserAccount();
	
	public boolean insertAccount();
	
	public boolean updateAccount();
	
	public boolean deleteAccount();
	
}
