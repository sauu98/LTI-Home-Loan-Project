package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public List<Product> getProducts();
	
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	public Product searchProduct(String prodid);
}
