import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CustomerProgram {
	
	static class Customer{
		int id;
		String name;
		String location;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		Customer[] customer=new Customer[3];
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<customer.length;i++) {
			customer[i]=new Customer();
		System.out.println("Enter id ");
		customer[i].id=scanner.nextInt();
		
		System.out.println("Enter id");
		customer[i].location=scanner.next();
		
		
		}
		
		FileWriter writer=new FileWriter("customer.json");
		gson.toJson(customer, System.out);
		gson.toJson(customer, writer);
		writer.close();
		scanner.close();
	}

}
