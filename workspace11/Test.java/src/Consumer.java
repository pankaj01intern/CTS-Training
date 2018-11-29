import java.util.HashMap;
import java.util.Map;

public class Consumer {
	int id;
	String name;
	String location;
	Map<Consumer, Address> map_address;
}

class Address{
	String street;
	String city;
	int pin;
	
	
}

class Main{
	public Main(){
		Consumer consumer = new Consumer();
		Address address=new Address();
		
		Map<Consumer, Address> map1=new HashMap<>();
		
		map1.put(consumer, address);
	}
}