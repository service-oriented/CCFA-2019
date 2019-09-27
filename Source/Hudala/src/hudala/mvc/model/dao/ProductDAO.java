package hudala.mvc.model.dao;

import hudala.mvc.model.dao.ShareControl;
import hudala.mvc.model.bean.Product;

import java.sql.ResultSet;


public interface ProductDAO extends ShareControl{


	public ResultSet getProduct(int id);
	
	public ResultSet getProduct(Product similar, int at, int total);
	
	public boolean addProduct(Product item);
	public boolean editProduct(Product item);
	public boolean delProduct(Product item);
	
	public ResultSet countProduct();
	
	
	public ResultSet searchProduct(String p);
	public ResultSet searchproduct(String k);
}
