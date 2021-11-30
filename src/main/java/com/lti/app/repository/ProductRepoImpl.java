package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Product;

@Repository
public class ProductRepoImpl implements ProductRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addProduct(Product product) {
		eMan.persist(product);
		
	}

	@Override
	public List<Product> getProducts() {
		
		Query qry=eMan.createQuery("from Product");
		return qry.getResultList();
	}

	@Override
	public boolean updateProduct(Product product) {
		
		eMan.merge(product);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		
		Product pp= eMan.find(Product.class, product.getProdid());
		eMan.remove(pp);
		return true;
	}

	@Override
	public Product searchProduct(String prodid) {
		
		Product pp= eMan.find(Product.class, prodid);
		return pp;
	}
	
	

}
