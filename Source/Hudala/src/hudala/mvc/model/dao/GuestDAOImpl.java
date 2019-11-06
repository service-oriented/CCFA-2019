package hudala.mvc.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import hudala.mvc.common.BasicImpl;
import hudala.mvc.model.bean.Guest;

public class GuestDAOImpl extends BasicImpl implements GuestDAO {

	public GuestDAOImpl(ConnectionPool cp) {
		super(cp, "Guest");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getAdminInfo() {
		String sql = "select * from guest where accountId = (select accountId from ccfa.account where role = 1);";
		return this.gets(sql);
	}

	@Override
	public boolean addGuest(Guest guest) {
		String sql = "INSERT INTO guest(fullname,accountId) VALUES(?,?)";
		try {
			PreparedStatement pre = this.con.prepareStatement(sql);
			pre.setString(1, guest.getFullName());
			pre.setLong(2, guest.getAccountId());
			return this.add(pre);
		} catch (SQLException e) {
			System.out.println("Khong them duoc");
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public ResultSet getGuest(long accountId) {
		String sql = "SELECT*FROM guest AS g INNER JOIN account AS a ON g.accountId=a.accountId  WHERE g.accountId=?";
		return this.get(sql, accountId);

	}

	@Override
	public boolean updateGuest(Guest guest) {

		String sql = "UPDATE guest SET fullName=?, birth =?,image=?, gender=?,  weight=?, height=?, "
				+ "job=?, body=?, phone=?, "
				+ "email=?,link=?, hairColor=?,skinColor=?,lip_thickness=?,faceShape=?, favorite=? where accountId=? ";
		try {
			PreparedStatement pre = this.con.prepareStatement(sql);
			pre.setString(1, guest.getFullName());
			pre.setTimestamp(2, (Timestamp) guest.getBirth());
			pre.setString(3, guest.getImage());
			pre.setBoolean(4, guest.isGender());
			pre.setFloat(5, guest.getWeight());
			pre.setFloat(6, guest.getHeight());
			pre.setString(7, guest.getJob());
			pre.setString(8, guest.getBody());
			pre.setString(9, guest.getPhone());
			pre.setString(10, guest.getEmail());
			pre.setString(11, guest.getLink());
			pre.setString(12, guest.getHairColor());
			pre.setString(13, guest.getSkinColor());
			pre.setString(14, guest.getLipThickness());
			pre.setString(15, guest.getFaceShape());
			pre.setString(16, guest.getFavorite());
			pre.setLong(17, guest.getAccountId());
			return this.add(pre);
		} catch (SQLException e) {
			System.out.println("Khong sua duoc");
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteGuest(Guest guest) {

		return true;
	}

	@Override
	public ResultSet getUserInfo(long accountId) {
		String sql = "select * from ccfa.guest where accountId = ?";
		return this.get(sql, accountId);
	}

}
