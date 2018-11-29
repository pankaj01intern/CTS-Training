package com.cts.product.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prodDao.saveProduct(product);
	}


	@Transactional
	public Product findProduct(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Transactional
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return prodDao.listAll();
	}

	
	@Transactional
	public boolean updateProduct(Product product) {
		// 1
		// 2
		// 3

		// TODO Auto-generated method stub
		return false;
	}


	@Transactional
	public boolean deleteProduct(String prodId) {
		// TODO Auto-generated method stub
		return false;
	}

}
