package hudala.mvc.commom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.ConnectionPoolImpl;

public class BasicImpl implements Basic {

	private ConnectionPool cp;
	protected Connection con;
	private String objectName;

	public BasicImpl(ConnectionPool cp, String objectName) {
		this.objectName = objectName;
		if(cp == null) {
			this.cp = new ConnectionPoolImpl();
		}else {
			this.cp = cp;
		}
		//Lấy kết nối
		try {
			this.con = this.cp.getConnectionPool(this.objectName);
			// Kiểm tra trạng thái kết nối
			if (this.con.getAutoCommit()) {
				// Chấm dứt chế độ thực thi tự động
				this.con.setAutoCommit(false);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean exe(PreparedStatement pre) {
		if(pre!=null) {
			try {
				int result = pre.executeUpdate();
				if(result==0) {
					this.con.rollback();
					return false;
				}
				this.con.commit();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
				try {
					this.con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return false;
	}

	@Override
	public boolean add(PreparedStatement pre) {
		// TODO Auto-generated method stub
		return this.exe(pre);
	}

	@Override
	public boolean edit(PreparedStatement pre) {
		// TODO Auto-generated method stub
		return this.exe(pre);
	}

	@Override
	public boolean del(PreparedStatement pre) {
		// TODO Auto-generated method stub
		return this.exe(pre);
	}

	@Override
	public ResultSet get(String sql, int value) {
		try {
			PreparedStatement pre =(PreparedStatement) this.con.prepareStatement(sql);
			if(value > 0) {
				pre.setInt(1, value);
			}
			return pre.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}
	
	public ResultSet get(String sql, int value1, int value2) {
		try {
			PreparedStatement pre =(PreparedStatement) this.con.prepareStatement(sql);
			if(value1 > 0 && value2 > 0) {
				pre.setInt(1, value1);
				pre.setInt(2, value2);
			}
			return pre.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ResultSet get(String sql, String username, String password) {
		try {
			PreparedStatement pre = (PreparedStatement) this.con.prepareStatement(sql);
			pre.setString(1, username);
			pre.setString(2, password);
			return pre.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ResultSet gets(String sql) {
		return this.get(sql, 0);
	}

	@Override
	public ResultSet[] gets(String[] sql) {
		ResultSet[] tmp = new ResultSet[sql.length];
		for (int i = 0; i < sql.length; i++) {
			tmp[i] = this.get(sql[i], 0);
		}
		return tmp;
	}

	@Override
	public ConnectionPool getCP() {
		return this.cp;
	}

	@Override
	public void releaseConnection() {
		// TODO Auto-generated method stub
		this.cp.releaseConnectionPool(this.con, this.objectName);
	}

	@Override
	public ResultSet get(String sql, String value) {
		try {
			PreparedStatement pre =(PreparedStatement) this.con.prepareStatement(sql);
			if(value != null) {
				pre.setString(1, value);
			}
			return pre.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public boolean exist(String sql, String user) {
		try {
			PreparedStatement preparedStatement = this.con.prepareStatement(sql);
			if(user!=null) {
				preparedStatement.setString(1, user);
			}
			ResultSet result = preparedStatement.executeQuery();
			if(result!=null) {
				if(result.next()) {
					return true;
				}
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
