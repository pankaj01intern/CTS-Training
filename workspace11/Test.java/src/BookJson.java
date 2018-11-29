import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Book{
	int isbn;
	String name;
	float price;
	List<Chapter> chapter_list;
	public Book(int isbn, String name, float price, List<Chapter> chapter_list) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.chapter_list = chapter_list;
	}
	
}

class Chapter{
	
	
	private int pageno;
	private String chapter_name;
		
	
	public Chapter(int pageno, String chapter_name) {
		super();
		this.pageno = pageno;
		this.chapter_name = chapter_name;
	}
	
}

public class BookJson {
	public static void main(String[] args) throws IOException{
		Chapter chapter1=new Chapter(10, "java");
		Chapter chapter2=new Chapter(12, "OOP in java");
		Chapter chapter3=new Chapter(14, "IO in java");
		
		List<Chapter> blist=new ArrayList<>();
		blist.add(chapter1);
		blist.add(chapter2);
		blist.add(chapter3);
		
		Book book=new Book(544567, "Java for beginners", 567, blist);
		
		FileWriter filewriter=new FileWriter("book.json");
		
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		gson.toJson(book, filewriter);
		filewriter.close();

}


}
