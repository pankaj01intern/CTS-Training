package com;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.model.Product;
import com.product.service.ProductService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");

		Product product=new Product();
		product.setProdId("P002");
		product.setProdName("pen");
		
		
		
		
		ProductService productService=ac.getBean("productService", ProductService.class);
		
		productService.saveProduct(product);
		productService.findProduct("P002");
		
		
		System.out.println("==============Done=============");

	}

}
