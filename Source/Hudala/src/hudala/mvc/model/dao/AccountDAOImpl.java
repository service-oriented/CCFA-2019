package hudala.mvc.model.dao;

import java.sql.ResultSet;

import hudala.mvc.common.BasicImpl;

public class AccountDAOImpl extends BasicImpl implements AccountDAO{

	public AccountDAOImpl(ConnectionPool cp) {
		super(cp, "Account");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultSet getAdminAccount() {
		String sql = "select * from ccfa.account where role = ?;";
		return this.get(sql, 1);
	}

	@Override
	public ResultSet getAllUserAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

}
