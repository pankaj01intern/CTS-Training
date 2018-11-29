package com;

import java.util.ArrayList;

public class Subject {
	
	
	static ArrayList<String> list=new ArrayList<String>();
	
	public static void addSubject(String subject){
		
		list.add(subject);
		System.out.println("Subject added successfully");
		System.out.println(list);
		
	}
	
	
    public static void delSubject(String subject){
		
    	int flag=0;
    	for(int i=0;i<list.size();i++){
    	
    		if((list.get(i)).equals(subject)){
    			list.remove(list.get(i));
    			System.out.println("Subject deleted successfully");
    			flag=1;
    		}
    		
    	}
    	if(flag!=1)
			System.out.println("Subject not found");
		
    }

}
