import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	float salary;
	String city;
}

class WriteEmployee{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Employee employee=new Employee();
		employee.id=8778;
		employee.name="suresh";
		employee.salary=35000;
		employee.city="madurai";
		
		ObjectOutputStream stream1=new ObjectOutputStream(new FileOutputStream("emp.ser"));
		
		stream1.writeObject(employee);
		System.out.println("emplyee object saved to the file");

	}

}
