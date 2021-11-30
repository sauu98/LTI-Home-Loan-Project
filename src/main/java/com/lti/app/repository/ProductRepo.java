package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Product;

public interface ProductRepo {
	
	public void addProduct(Product product);
	public List<Product> getProducts();
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public Product searchProduct(String prodid);
	
	

}
