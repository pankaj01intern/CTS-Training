package com;

public class RestourantMenu {
	
	
	static String itemCode[]={"A001","A002","A003","A005","A008"}; 
	static String itemName[]={"Veg Roll","Mineral Water","Chilli Chicken","Chicken Biryani","Cock Pet Bottle"}; 
	static int price[]={50,30,300,250,45};
	
	public static void main(String[] args) {
		try {
			Customer.menu(itemCode,itemName,price);
		} catch (CannotPlaceOrderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Server server=new Server();
		server.cook();
	}
	
	 
	/*public String[] getItemCode() {
		return itemCode;
	}
	public void setItemCode(String[] itemCode) {
		this.itemCode = itemCode;
	}
	public String[] getItemName() {
		return itemName;
	}
	public void setItemName(String[] itemName) {
		this.itemName = itemName;
	}
	public int[] getPrice() {
		return price;
	}
	public void setPrice(int[] price) {
		this.price = price;
	} */

}
