package hudala.mvc.model.dao;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;


import com.mysql.jdbc.Connection;
public class ConnectionPoolImpl implements ConnectionPool {

	private String drive;
	private String url;
	private String user;
	private String pass;
	public Stack<Connection> pool;
	
	public ConnectionPoolImpl() {
		this.drive = "com.mysql.jdbc.Driver";
		try {
			Class.forName(this.drive).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.url = "jdbc:mysql://localhost:3306/ccfa?useSSL=false";
		this.user = "root"; 
		this.pass = "Hoabingan"; 
		this.pool = new Stack<Connection>();
	}

	@Override
	public Connection getConnectionPool(String ObjectName) throws SQLException {
		// TODO Auto-generated method stub
		if(this.pool.isEmpty()) {
			System.out.println(ObjectName + " has created a new connect");
			return (Connection) DriverManager.getConnection(this.url, user, pass);
		}else {
			System.out.println(ObjectName + " has popped a connect");
			return (Connection) this.pool.pop();
		}
	}

	@Override
	public void releaseConnectionPool(Connection con, String ObjectName) {
		// TODO 
		System.out.println(ObjectName + " has pushed a connect");
		this.pool.push(con);
	}
	
	public void finalize() throws Throwable{
		this.pool.clear();
		this.pool = null;
		System.gc();
		System.runFinalization();
		System.out.println("CPool is closed!");
	}
	public static void main(String[] args) throws SQLException {
		ConnectionPool connec = new ConnectionPoolImpl() ;
		connec.getConnectionPool("hung");
	}
	
}


