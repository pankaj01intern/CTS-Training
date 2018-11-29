package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.AppConfig;
import com.product.entities.Product;
import com.product.service.ProductService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ctx.getBean("prodService", ProductService.class);

		Product prod = new Product();
		prod.setProdId("P032");
		prod.setProdName("Iphone 7S");
		prod.setPrice(65434);

		ps.saveProduct(prod);
		
		System.out.println("-- Done --");

	}

}