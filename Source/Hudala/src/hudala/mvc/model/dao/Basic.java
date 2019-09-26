package hudala.mvc.model.dao;


import java.sql.ResultSet;

import java.sql.PreparedStatement;

import hudala.mvc.model.dao.ShareControl;

public interface Basic extends ShareControl{
	public boolean add(PreparedStatement pre);
	public boolean edit(PreparedStatement pre);
	public boolean del(PreparedStatement pre);
	public ResultSet get(String sql, int value);
	public ResultSet get(String sql, String username, String password);
	public ResultSet gets(String sql);
	public ResultSet[] gets(String[] sql);
	public ResultSet get(String sql, String value);
	
	public boolean exist(String sql, String user);
}