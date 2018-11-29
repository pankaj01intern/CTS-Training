package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.product.model.ProductAdd;


public class ProductDaoImpl implements ProductDao{

	List<ProductAdd> prods = null;
	List<ProductAdd> prods2 = null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	@Override
	public boolean saveProduct(ProductAdd product) throws Exception {
		Connection con=ProductDaoUtil.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select id from product");
		
			while(rs.next())	
			{
				
     		if(rs.getString("id").equals(product.getId()))
     			return false;				
			}
	
		String qry="insert into product values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(qry);
		ps.setString(1, product.getId()); 
		ps.setString(2, product.getName());
		ps.setDouble(3, product.getPrice());
		ps.setString(4, product.getDescription());

		int x=ps.executeUpdate();
		return true;
	}
   
	@Override
	public List<ProductAdd> displayProduct() throws SQLException {
		prods= new ArrayList<ProductAdd>();
		Connection con=ProductDaoUtil.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from product");
		while (rs.next()) {
			ProductAdd prod = new ProductAdd();
			prod.setId(rs.getString(1));
			prod.setName(rs.getString(2));
			prod.setPrice(rs.getDouble(3));
			prod.setDescription(rs.getString(4));

			prods.add(prod);
		}
		
		return prods;
	}
	
	@Override
	public ProductAdd findProduct(String id) {
		ProductAdd prod=null;
		
		try {
			Connection con=ProductDaoUtil.getConnection();
			String qry="select * from product where id=?";
			ps=con.prepareStatement(qry);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				prod=new ProductAdd();
				prod.setId(rs.getString(1));
				prod.setName(rs.getString(2));
				prod.setPrice(rs.getDouble(3));
				prod.setDescription(rs.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prod;
	}

	
	
	@Override
	public boolean updateProduct(ProductAdd product) throws Exception{
		
			Connection con=ProductDaoUtil.getConnection();
			String qry="update product set name=?, price=?, description=?  where id=?";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setString(3, product.getDescription());
			ps.setString(4, product.getId());
			int x=0; 
			x=ps.executeUpdate();
            if(x!=0)
		    return true;
            else
            	return false;
	}

	
	
	
	@Override
	public boolean deleteProduct(String id) throws Exception{
			Connection con=ProductDaoUtil.getConnection();
			String qry="delete from product where id=?";
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setString(1, id);
			int x=0; 
			x=ps.executeUpdate();
            if(x!=0){
		    return true;
            }
            else{
            	return false;
            }
	}
	

}
