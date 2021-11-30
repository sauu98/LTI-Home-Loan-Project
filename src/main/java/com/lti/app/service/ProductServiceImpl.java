package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.pojo.Product;
import com.lti.app.repository.ProductRepo;

@Service
@Transactional    //if we specifiy this we do not need to explicitly specify transaction.begin() etc
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo pRepo;    // Injecting Product Repo class

	@Override
	public void addProduct(Product product) {
		
		pRepo.addProduct(product);
	}

	@Override
	public List<Product> getProducts() {
		
		return pRepo.getProducts();
	}

	@Override
	public boolean updateProduct(Product product) {
	
		return pRepo.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(Product product) {
		
		return pRepo.deleteProduct(product);
	}

	@Override
	public Product searchProduct(String prodid) {
		
		return pRepo.searchProduct(prodid);
	}

	
}
