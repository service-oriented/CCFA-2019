package hudala.mvc.model.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import hudala.mvc.model.bean.User;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.GuestDAO;
import hudala.mvc.model.dao.GuestDAOImpl;

public class GuestService {

	private GuestDAO guestDAO;

	public GuestService(ConnectionPool cp) {
		guestDAO = new GuestDAOImpl(cp);
	}
	
	public void finalize() throws Throwable{
		this.guestDAO = null;
		super.finalize();
	}
	
	public ConnectionPool getCP() {
		return this.guestDAO.getCP();
	}
	
	public void releaseConnection() {
		this.guestDAO.releaseConnection();
	}
	
	public User getAdminInfo() {
		User AdminInfo = null;
		ResultSet rs = guestDAO.getAdminInfo();
		if(rs!=null) {
			try {
				if(rs.next()) {
					AdminInfo = new User(rs.getString("fullName"), rs.getDate("birth"), rs.getString("image"),
							rs.getBoolean("gender"), rs.getString("phone"), rs.getString("email"), rs.getString("link"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return AdminInfo;
	}
}
