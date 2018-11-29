public class DeliveryBO {

	
	void displayAllDeliveryDetails(Delivery[] list){
		String s1="Over";
		String s2="Ball";
		String s3="Runs";
		String s4="Batsman";
		String s5="Bowler";
		String s6="NonStriker";
		System.out.println("Delivery Details");
		String res=String.format("%-20s %-20s %-20s %-20s %-20s %s",s1,s2,s3,s4,s5,s6);
		System.out.println(res);
		for(int j=0;j<list.length;j++){
		String s=String.format("%-20s %-20s %-20s %-20s %-20s %s",list[j].getOver(),list[j].getBall(),list[j].getRuns(),
				
				list[j].getBatsman(),list[j].getBowler(),list[j].getNonStriker());
		System.out.println(s);
	}
	}
	
	
	void displayBatsmanBowlerDetails(Delivery[] deliveryList, long ball,long over){
		
		for(int i=0;i<deliveryList.length;i++){
			if(deliveryList[i].getOver() == over && deliveryList[i].getBall()== ball){
		System.out.println("Batsman : "+ deliveryList[i].getBatsman());
			System.out.println("Bowler : "+ deliveryList[i].getBowler());
			}
		}
		
	}
	
	
	void displayMaximumRunDetails(Delivery[] deliveryList){
		
		long max=0l;
		int index=0;
		for(int j=0;j<deliveryList.length;j++){
		if(deliveryList[j].getRuns() > max){
			max=deliveryList[j].getRuns();
			index=j;
		}
		}
		
		System.out.println("Maximum Runs : "+max);
		System.out.println("Over : "+deliveryList[index].getOver());
		System.out.println("Ball : "+deliveryList[index].getBall());
	}
	
	
	
	
	
	
}
