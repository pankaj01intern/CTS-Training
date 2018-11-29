package com;


import java.util.Scanner;
import java.util.concurrent.CancellationException;


public class Customer {
	static int length=5;
	static Scanner sc=new Scanner(System.in);
	static int totalOrder;
	public static void menu(String itemCode[],String itemName[],int price[]) throws CannotPlaceOrderException{
		System.out.println("ItemCode"+"        "+"ItemName"+"          "+"price");
		
		 String items[][]=new String[itemCode.length][itemCode.length];
		 for(int i=0;i<itemCode.length;i++){
			 for(int j=0;j<itemCode.length;j++){
				 if(i==0)
				 items[i][j]=itemCode[j];
				 else if(i==1){
					 items[i][j]=itemName[j];
				 }
				 else{
					 String stringPrice=price[j]+"";
					 items[i][j]=stringPrice;
				 }	
			 }
		 }
		 
		 //  Displaying Restaurant Menu to the customer;
		 for(int i=0;i<length;i++)
		 {
			 int k=0;
			 for(int j=0;j<3;j++){
	            System.out.print(items[k++][i] + "             ");
			 }
			 System.out.println();
		 }
		 
		 // Taking Order by the Server
		 System.out.println("How many items do you want to have: ");
		 totalOrder=sc.nextInt();
		 String order[]=new String[totalOrder];
		 String itemsString=new String(itemCode);
		 if(totalOrder <6 && totalOrder>0 )
		 {
			 System.out.println("please select the items from the menu: ");
			 for(int i=0;i<totalOrder;i++){
				 order[i]=sc.next();
			 }
			 for(int i=0;i<totalOrder;i++){
				 if(itemCode.equals(order[i])){
					 System.out.println("contains");
				 }
				 else
					 throw new CannotPlaceOrderException("Ordered items is not available");
			 }
			 
		 }
		 
		
	}
}
