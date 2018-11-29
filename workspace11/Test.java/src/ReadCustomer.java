import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.google.gson.Gson;


public class ReadCustomer {
	static class Customer{
		int id;
		//String name;
		String location;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		FileReader filereader=new FileReader("customer.json");
		
		Customer customer[]=gson.fromJson(filereader, Customer[].class);
		 System.out.println("id\tLocation");
		for(Customer customer2 : customer){
			System.out.println(customer2.id+"\t"+customer2.location);
		}

	}

}
