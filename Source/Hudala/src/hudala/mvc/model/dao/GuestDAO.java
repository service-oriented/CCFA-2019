package hudala.mvc.model.dao;

import java.sql.ResultSet;

public interface GuestDAO extends ShareControl{
	
	ResultSet getAdminInfo();

}
