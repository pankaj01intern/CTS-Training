package com.product.dao;

import java.util.List;

import com.product.model.ProductAdd;

public interface ProductDao {
	
	public boolean saveProduct(ProductAdd product) throws Exception;
	public List<ProductAdd> displayProduct() throws Exception;
	public ProductAdd findProduct(String id) throws Exception;;
	public boolean updateProduct(ProductAdd product) throws Exception;
	public boolean deleteProduct(String id) throws Exception;

}
