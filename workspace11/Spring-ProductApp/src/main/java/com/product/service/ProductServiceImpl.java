package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;
import com.product.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao productDao;

	public void saveProduct(Product prod) {
		productDao.saveProduct(prod);
		
		
	}

	public Product findProduct(String prodId) {
		Product product=productDao.findProduct(prodId);
		return product;
		
	}
	
	

}
