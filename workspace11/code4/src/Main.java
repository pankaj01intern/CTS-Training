import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String s=br.readLine();
		 int res=UserMainCode.largestChunk(s);

	}

}