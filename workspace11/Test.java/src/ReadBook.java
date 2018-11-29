import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;

public class ReadBook {
	static class Book{
		int isbn;
		String name;
		float price;
		List<> book_list;
	}

	static class BookChapter{
		int pageno;
		String chapter_name;
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Gson gson=new Gson();
		FileReader filereader=new FileReader("book.json");
		
		Book book= gson.fromJson(filereader, Book.class);
		System.out.println(""+book.isbn+"\t"+book.name+"\t"+book.price);
		List<Chapter> blist=book.book_list;
		System.out.println(""+blist.size());
		for(chapter)
	}

}
