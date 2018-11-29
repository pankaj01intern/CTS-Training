package com.product.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;
import com.product.model.ProductAdd;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           
		
	    RequestDispatcher rd=null;
	    ProductDao productdao = null;
	    String option=request.getParameter("Menu");
	    
		if(option.equals("add")){
			ProductAdd product=new ProductAdd();
		    productdao=new ProductDaoImpl();
			
			product.setId(request.getParameter("id"));
			product.setName(request.getParameter("name"));
			product.setPrice(Double.parseDouble(request.getParameter("price")));
			product.setDescription(request.getParameter("description"));
			
			boolean status;
			String url=null;
			
			try {
			status=productdao.saveProduct(product);
			if(!status){
				url="AddProduct.jsp?msg=Product Id Already exists.Product is Not Added";	
			}else {
				url="AddProduct.jsp?msg=Product Added Successfully";
			}
			
			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
			
			} catch (Exception e) {}
		}
		
		
		if(option.equals("Display")){
			productdao=new ProductDaoImpl();
			List<ProductAdd> products=null;
			try {
				products = ((ProductDaoImpl) productdao).displayProduct();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			String url = null;
			if (products != null) {
				request.setAttribute("products", products);
				url = "DisplayProduct.jsp";
			} else {
				url = "DisplayProduct.jsp?msg=No records to display";
			}

			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
			
		}
		
		
		if(option.equals("Find")){
			productdao=new ProductDaoImpl();
			String id=request.getParameter("id");
			ProductAdd products=null;
			try {
				products = productdao.findProduct(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String url = null;
			if (products != null) {
				request.setAttribute("product", products);
				url = "Product.jsp?msg=Product Found";
			} else {
				url = "SearchDummy.jsp?msg=No Product Found";
			}
			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
			
		}
		
		
		if(option.equals("Update")){
			
		    productdao=new ProductDaoImpl();
			ProductAdd product=new ProductAdd();	
			product.setId(request.getParameter("id"));
			product.setName(request.getParameter("name"));
			product.setPrice(Double.parseDouble(request.getParameter("price")));
			product.setDescription(request.getParameter("description"));
			boolean status=false;
			try {
				status = productdao.updateProduct(product);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String url = null;
			if (status ==true) {
				url = "UpdateDummy2.jsp?msg=Product Found and Updated Successfully ";
			} else {
				url = "UpdateDummy.jsp?msg=No Product Found";
			}
			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}
		
		
		
		if(option.equals("FindDelete")){
			productdao=new ProductDaoImpl();
			String id=request.getParameter("id");
			boolean status=false;
			try {
			    status = productdao.deleteProduct(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String url = null;
			if (status == true) {
				url = "DeleteSearch.jsp?msg=Product Found and Deleted Successfully";
			} else {
				url = "DeleteSearchDummy.jsp?msg=No Product Found";
			}
			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
			
		}
		
				
	}

}
