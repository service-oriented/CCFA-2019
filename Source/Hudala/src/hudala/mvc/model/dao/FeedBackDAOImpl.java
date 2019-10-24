package hudala.mvc.model.dao;

import java.sql.ResultSet;

import hudala.mvc.common.BasicImpl;

public class FeedBackDAOImpl extends BasicImpl implements FeedBackDAO{

	public FeedBackDAOImpl(ConnectionPool cp) {
		super(cp, "FeedBack");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getTop3FeedBack() {
		String sql = "select feedbackId,sentTime,fullName,content,image from feedback f join guest g on f.sender = g.accountId order by (timediff(now(),sentTime)) limit 3";
		return this.gets(sql);
	}

	@Override
	public ResultSet countMessage() {
		String sql = "select count(*) as counter from feedback where status = 0";
		return this.gets(sql);
	}
	

}
