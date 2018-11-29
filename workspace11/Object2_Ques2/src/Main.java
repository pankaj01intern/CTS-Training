import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     try {
    	System.out.println("Enter the player name");
		String name=br.readLine();
		System.out.println("Enter the country name");
        String country=br.readLine();
        System.out.println("Enter the skill");
        String skill=br.readLine();
    
        
        Player mtch=new Player(name,country,skill);
        System.out.println("Player Details");
        System.out.println(mtch);
     
     } catch (IOException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}

	}

}
