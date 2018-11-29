package com.cts.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entities.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	
	public boolean saveProduct(Product product) {

		Session ses = sf.getCurrentSession();

		ses.save(product);

		return true;

	}

	
	public Product findProduct(String prodId) {
		return sf.getCurrentSession().get(Product.class, prodId);
	}


	public List<Product> listAll() {
		return sf.getCurrentSession().createQuery("from Product").list();
	}


	public Product updateProduct(Product product) {

		return (Product) sf.getCurrentSession().merge(product);
	}


	public boolean deleteProduct(String prodId) {

		Session ses = sf.getCurrentSession();
		ses.delete(prodId);
		return true;
	}

}
