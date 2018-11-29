package com.product.dao;

import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao{

	public void saveProduct(Product prod) {
		System.out.println("product is saved \n"+prod.getProdId() + "  " + prod.getProdName());
		
	}

	public Product findProduct(String prodId) {
		
		return null;
	}
	
	

}
