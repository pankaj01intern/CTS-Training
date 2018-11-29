import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectInputStream stream;
		try{
			stream=new ObjectInputStream(new FileInputStream("emp.ser"));
			
			Employee employee=(Employee) stream.readObject();
			System.out.println("id is "+employee.id+" name is "+employee.name+" salary is "+employee.salary+" city is "+employee.city);
			System.out.println("");
		}catch{
			
		}

	}

}
