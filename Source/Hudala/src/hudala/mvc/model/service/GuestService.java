package hudala.mvc.model.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.Guest;
import hudala.mvc.model.bean.User;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.GuestDAO;
import hudala.mvc.model.dao.GuestDAOImpl;

public class GuestService {

	private GuestDAO guestDAO;

	public GuestService(ConnectionPool cp) {
		guestDAO = new GuestDAOImpl(cp);
	}

	public void finalize() throws Throwable {
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
		User adminInfo = null;
		ResultSet rs = guestDAO.getAdminInfo();
		if (rs != null) {
			try {
				if (rs.next()) {
					adminInfo = new User(rs.getString("fullName"), rs.getDate("birth"), rs.getString("image"),
							rs.getBoolean("gender"), rs.getString("phone"), rs.getString("email"),
							rs.getString("link"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return adminInfo;
	}

	public Guest getUserInfo(long accountId) {
		Guest userInfo = null;
		ResultSet rs = guestDAO.getUserInfo(accountId);
		try {
			if (rs.next()) {
				userInfo = new Guest(rs.getString("fullName"), rs.getDate("birth"), rs.getString("image"),
						rs.getBoolean("gender"), rs.getString("phone"), rs.getString("email"), rs.getString("job"),
						rs.getString("link"),rs.getLong("accountId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userInfo;

	}

	// them mot khach hang voi fullname a accountid
	public boolean addGuest(Guest guest) {

		return this.guestDAO.addGuest(guest);
	}

	public boolean updateGuest(Guest guest) {

		return this.guestDAO.updateGuest(guest);
	}

	public int checkAccountId(long accountId) {
		ArrayList<Guest> items = new ArrayList<Guest>();
		Guest item = null;
		ResultSet rs = this.guestDAO.getGuest(accountId);
		if (rs != null) {
			try {
				while (rs.next()) {
					item = new Guest(null, null, null, true, null, null, null);
					item.setJob(null);
					item.setWeight(0);
					item.setHeight(0);
					item.setBody(null);
					item.setHairColor(null);
					item.setSkinColor(null);
					item.setLipThickness(null);
					item.setFaceShape(null);
					item.setFavorite(null);
					item.setAccountId(rs.getLong("accountId"));

					items.add(item);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return items.size();
	}

	// lay thong tin cua khach hang
	public ArrayList<Guest> getGuest(long accountId) {
		ArrayList<Guest> items = new ArrayList<Guest>();
		Guest item = null;
		ResultSet rs = this.guestDAO.getGuest(accountId);
		if (rs != null) {
			try {
				while (rs.next()) {
					item = new Guest(null, null, null, true, null, null, null);
					item.setGuestId(rs.getLong("guestId"));
					item.setFullName(rs.getString("fullName"));
					item.setBirth(rs.getTimestamp("birth"));
					item.setGender(rs.getBoolean("gender"));
					item.setImage(rs.getString("image"));
					item.setWeight(rs.getFloat("weight"));
					item.setHeight(rs.getFloat("height"));
					item.setJob(rs.getString("job"));
					item.setLink(rs.getString("link"));
					item.setBody(rs.getString("body"));
					item.setHairColor(rs.getString("hairColor"));
					item.setPhone(rs.getString("phone"));
					item.setEmail(rs.getString("email"));
					item.setSkinColor(rs.getString("skinColor"));
					item.setLipThickness(rs.getString("lip_thickness"));
					item.setFaceShape(rs.getString("faceShape"));
					item.setFavorite(rs.getString("favorite"));
					item.setAccountId(rs.getLong("accountId"));
					Account account = new Account();
					account.setAccountId(rs.getLong("accountId"));
					account.setUsername(rs.getString("username"));
					account.setPassword(rs.getString("password"));
					account.setStatus(rs.getBoolean("status"));
					account.setRole(rs.getBoolean("role"));
					item.setAccount(account);

					items.add(item);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return items;
	}
}
