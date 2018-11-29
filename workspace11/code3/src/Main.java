import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    
    public static void main(String args[]) throws NumberFormatException, IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of deliveries");
        int del=Integer.parseInt(br.readLine());
        Delivery[] list=new Delivery[del];
        		
        for(int i=0;i<del;i++){
        	
        System.out.println("Enter the over");
        long over=Long.parseLong(br.readLine());
        System.out.println("Enter the ball");
        long ball=Long.parseLong(br.readLine());
        System.out.println("Enter the runs");
        long runs=Long.parseLong(br.readLine());
        System.out.println("Enter the batsman name");
        String batsman=br.readLine();
        System.out.println("Enter the bowler name");
        String bowler=br.readLine();
        System.out.println("Enter the nonStriker name");
        String nonStriker=br.readLine();
   
        list[i]=new Delivery(over,ball,runs,batsman,bowler,nonStriker);
      
       // ;
        
        }
        
        System.out.println("Enter your choice");
        System.out.println("1.View delivery details");
        System.out.println("2.Batsman and Bowler");
        System.out.println("3.Maximum runs");
        
        int choice=Integer.parseInt(br.readLine());
        
        switch(choice){
        
        case 1:
        	(new DeliveryBO()).displayAllDeliveryDetails(list);
        	break;
        	
        case 2:
        	System.out.println("Enter the over for which batsman and bowler to be known");
        	long over=Long.parseLong(br.readLine());
        	System.out.println("Enter the ball for which batsman and bowler to be known");
        	long ball=Long.parseLong(br.readLine());
        	(new DeliveryBO()).displayBatsmanBowlerDetails(list, ball, over);
        	break;
        	
        	
        case 3:
        	(new DeliveryBO()).displayMaximumRunDetails(list);
        	break;
        
        }
       
        
        
     	}
    }

    
    
    