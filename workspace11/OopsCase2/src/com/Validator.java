package com;

public class Validator {
	
	public static Validator getValidator(){
		
		return new Validator();
	}

	
	
	public boolean validateStudentDetails(Student student) throws Exception{
		
		int age=Integer.parseInt(student.getAge());
		if( age> 35 || age < 23){
			throw new Exception();
		}
			//return false;
		else
		return true;
	}
}
