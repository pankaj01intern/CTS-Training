import java.io.FileWriter; 
import java.io.IOException;

import com.google.gson.Gson;
import java.util.Date;
import com.google.gson.GsonBuilder;

class Product{
	int id;
	String name;
	Date expiry_date;
}
public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Gson gson=new Gson();
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		Product product=new Product();
		product.id=87887;
		product.name="Biscuit";
		product.expiry_date=new Date(2017-1900, 12, 12);
		
		gson.toJson(product, System.out);
		FileWriter writer=new FileWriter("product.json");
		gson.toJson(product,writer);
		writer.close();

	}

}
