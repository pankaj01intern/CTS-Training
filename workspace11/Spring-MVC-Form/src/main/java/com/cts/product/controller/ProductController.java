package com.cts.product.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductServiceImpl;

@Controller
@SessionAttributes("data")
public class ProductController {

	@Autowired
	private ProductServiceImpl ps;

	@RequestMapping("/")
	public String welcome() {

		return "index";
	}

	
	
	@RequestMapping(value = "/s3")
	public String saveProduct2(Model model) {
		Product prod = new Product();
		prod.setProdId("P004131");
		prod.setProdName("pen");
		prod.setPrice(2142334);
		
		String[] branches = { "b1", "b2", "b3", "b4", "b5" };
		prod.setBranches(branches);
		model.addAttribute("product", prod);
		model.addAttribute("branches", branches);
		return "display";
	}
	
	@RequestMapping(value = "/s4")
	public String saveProduct3(Model model) {
		Product prod=new Product();

 
		List<String> cars=new ArrayList<String>();
		List<String> cust=new ArrayList<String>();
		cars.add("audi");
		cars.add("bmw");
		cars.add("hyundai");
		
		cust.add("pankaj");
		cust.add("pan");
		cust.add("sah");
		
		Map<String, ArrayList<String>> data=new HashMap<String, ArrayList<String>>();
		data.put("cars",(ArrayList<String>) cars);
		data.put("cust",(ArrayList<String>) cust);
		
		
		model.addAttribute("data",data);
		
		return "product";
	}



	
}
