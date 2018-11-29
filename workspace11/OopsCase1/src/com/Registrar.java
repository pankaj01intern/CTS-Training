package com;

public class Registrar {
	
  static long addmissionId=724468l;
	private Registrar(){
		
	}
	
	
    public static  Registrar getRegistrar(){
		  return new Registrar();
	}

    
    public void registerStudent(Student student){
  
    		boolean status=Validator.getValidator().validateStudentDetails(student);
    		if(status){
                Long l=addmissionId;
    			student.addmissionID=l.toString();
    			addmissionId++;
    		}
    		else
    			System.out.println("Student details is not valid. please enter valid details... ");
    }


	

}
