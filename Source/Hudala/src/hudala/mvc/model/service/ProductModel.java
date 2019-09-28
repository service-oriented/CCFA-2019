package hudala.mvc.model.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import hudala.mvc.model.dao.ConnectionPool;

import hudala.mvc.model.dao.ProductDAO;
import hudala.mvc.model.dao.ProductImplDAO;
import hudala.mvc.model.bean.Product;


public class ProductModel {

	private ProductDAO p;

	public ProductModel(ConnectionPool cp) {
		
		this.p = new ProductImplDAO(cp);
	}
	public void finalize() throws Throwable{
		this.p = null;
		super.finalize();
	}
	
	public ConnectionPool getCP() {
		return this.p.getCP();
	}
	
	public void releaseConnection() {
		this.p.releaseConnection();
	}
	
	public ArrayList<Product> getProducts(int productId) {
		ArrayList<Product> items = new ArrayList<Product>();
		Product item = null;
		ResultSet rs = this.p.getProduct(productId);
		
		if(rs!=null) {
			try {
				while(rs.next()) {
					item = new Product();
					item.setProductId(rs.getInt("productId"));
					
					item.setCode(rs.getString("code"));
					item.setTitle(rs.getString("title"));
					item.setDescription(rs.getString("description"));
					item.setCategory(rs.getString("category"));
					item.setCreatedDate(rs.getDate("createdDate"));
					item.setCreatedBy(rs.getInt("createdBy"));
					
					
					
					
					items.add(item);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return items;
	}
}
