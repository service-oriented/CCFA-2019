package hudala.mvc.model.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import hudala.mvc.dto.InboxDto;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.FeedBackDAO;
import hudala.mvc.model.dao.FeedBackDAOImpl;

public class FeedBackService {
	private FeedBackDAO feedBackDAO;

	public FeedBackService(ConnectionPool cp) {
		feedBackDAO = new FeedBackDAOImpl(cp);
	}

	public void finalize() throws Throwable {
		this.feedBackDAO = null;
		super.finalize();
	}

	public ConnectionPool getCP() {
		return this.feedBackDAO.getCP();
	}

	public void releaseConnection() {
		this.feedBackDAO.releaseConnection();
	}

	public List<InboxDto> getTop3FeedBack() {
		List<InboxDto> inboxTop3 = new ArrayList<>();
		ResultSet rs = feedBackDAO.getTop3FeedBack();
		if (rs != null) {
			try {
				while (rs.next()) {
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm - dd MMMMM");
					String sentTime = simpleDateFormat.format(rs.getTimestamp("sentTime"));
					inboxTop3.add(new InboxDto(sentTime, rs.getString("image"), rs.getString("fullName"),
							rs.getString("content")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return inboxTop3;
	}

	public int countMessage() {
		int counter = 0;
		ResultSet rs = feedBackDAO.countMessage();
		if (rs != null) {
			try {
				while (rs.next())
					counter = rs.getInt("counter");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return counter;
	}
}
