package hudala.mvc.model.dao;

import java.sql.ResultSet;

public interface AccountDAO extends ShareControl{
	
	ResultSet getAdminAccount();
	
	ResultSet getAllUserAccount();	
	
}
