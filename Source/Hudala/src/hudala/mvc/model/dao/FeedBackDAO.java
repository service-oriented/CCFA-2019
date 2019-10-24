package hudala.mvc.model.dao;

import java.sql.ResultSet;

public interface FeedBackDAO extends ShareControl{
	
	ResultSet getTop3FeedBack();
	
	ResultSet countMessage();
}
