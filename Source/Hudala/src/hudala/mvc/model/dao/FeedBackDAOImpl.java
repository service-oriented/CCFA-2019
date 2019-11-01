package hudala.mvc.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import hudala.mvc.common.BasicImpl;
import hudala.mvc.model.bean.FeedBack;

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

	@Override
	public boolean addFeedBack(FeedBack item) {
		
   String sql="INSERT INTO feedback(title,content,sentTime,sender) values(?,?,?,? )" ;
		
		try {
			PreparedStatement pre=this.con.prepareStatement(sql);
			pre.setString(1, item.getTitle());
			pre.setString(2,item.getContent());
			pre.setTimestamp(3,(Timestamp)  item.getSentTime());
			pre.setLong(4, item.getSender());
			return this.add(pre);
		} catch (SQLException e) {
			System.out.println("Khong them duoc");
			e.printStackTrace();
		}
		
		return false;
	}
	

}
