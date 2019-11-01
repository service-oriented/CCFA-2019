package hudala.mvc.model.dao;

import java.sql.ResultSet;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.FeedBack;

public interface FeedBackDAO extends ShareControl{
	
	ResultSet getTop3FeedBack();
	
	ResultSet countMessage();
	//them mot cau phan hoi
	public boolean addFeedBack(FeedBack item);
}
