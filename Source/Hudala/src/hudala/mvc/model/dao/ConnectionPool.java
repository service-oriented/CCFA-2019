package hudala.mvc.model.dao;

import java.sql.SQLException;
import java.sql.Connection;

public interface ConnectionPool {
	public Connection getConnectionPool(String ObjectName) throws SQLException;
	public void releaseConnectionPool(Connection con, String ObjectName);
}