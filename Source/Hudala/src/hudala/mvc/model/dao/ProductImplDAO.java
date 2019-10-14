package hudala.mvc.model.dao;

import java.sql.ResultSet;

import hudala.mvc.common.BasicImpl;
import hudala.mvc.model.bean.Product;
import hudala.mvc.model.dao.ProductDAO;

public class ProductImplDAO extends BasicImpl implements ProductDAO {

	public ProductImplDAO(ConnectionPool cp) {
		super(cp,"Product");
		
	}

	@Override
	public ResultSet getProduct(int id) {
		String sql = "SELECT * FROM product WHERE productId=?";
		
		return this.get(sql, id);
	}

	@Override
	public ResultSet getProduct(Product similar, int at, int total) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProduct(Product item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editProduct(Product item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delProduct(Product item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResultSet countProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet searchProduct(String p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet searchproduct(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
