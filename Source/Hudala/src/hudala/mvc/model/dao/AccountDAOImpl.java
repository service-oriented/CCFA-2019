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
		String sql = "select * from ccfa.account where role = ?";
		return this.get(sql, 1);// tai khoan role = 1
	}

	@Override
	public ResultSet getAllUserAccount() {
		String sql = "select * from ccfa.account where role = 0";
		return this.gets(sql);// tai khoan role = 0
	}

}
