import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class prductjson {

	static class Product{
		int id;
		String name;
		float cost;
		
	}
	public static void main(String args[]) throws IOException{
		Gson gson=new Gson();
				
		URL url=		new URL("file:///C:/JSON/product11.json");
		
		InputStreamReader reader=new InputStreamReader(url.openStream());
		StringBuilder builder=new StringBuilder();
		
		int x;
		while((x=reader.read())!=-1){
			builder.append((char) x);
		}
		
		Product product=gson.fromJson(builder.toString(), Product.class);
		
		System.out.println(product.id+" "+product.name+" "+product.cost);
		
	}
}
