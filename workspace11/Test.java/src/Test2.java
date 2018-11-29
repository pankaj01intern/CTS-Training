import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
public class Test2 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		FileReader fileReader=new FileReader("product.json");
		
		Gson gson=new Gson();
		Product product=gson.fromJson(fileReader, Product.class);
		
		System.out.println("product id: "+product.id);
		System.out.println("product name: "+product.name);
		System.out.println("product expiry: "+product.expiry_date);
		
	}

}
