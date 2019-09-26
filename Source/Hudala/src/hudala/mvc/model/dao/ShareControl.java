package hudala.mvc.model.dao;

import hudala.mvc.model.dao.ConnectionPool;

public interface ShareControl {
	public ConnectionPool getCP();
	public void releaseConnection();
}

