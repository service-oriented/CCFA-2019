package hudala.mvc.model.dao;

import java.sql.ResultSet;

import hudala.mvc.common.BasicImpl;

public class GuestDAOImpl extends BasicImpl implements GuestDAO{

	public GuestDAOImpl(ConnectionPool cp) {
		super(cp, "Guest");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getAdminInfo() {
		String sql = "select * from guest where accountId = (select accountId from ccfa.account where role = 1);";
		return this.gets(sql);
	}

}
