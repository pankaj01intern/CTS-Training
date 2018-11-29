package com;

public class Student {
	
	private static final Student Student = null;
	

	private String name, maritalStatus,age,sex,dob,address,primaryEmailID,secondaryEmailID,phoneNumber,highestEducQuali,nationality;
	
	static String addmissionID;
   
    

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrimaryEmailID() {
		return primaryEmailID;
	}

	public void setPrimaryEmailID(String primaryEmailID) {
		this.primaryEmailID = primaryEmailID;
	}

	public String getSecondaryEmailID() {
		return secondaryEmailID;
	}

	public void setSecondaryEmailID(String secondaryEmailID) {
		this.secondaryEmailID = secondaryEmailID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHighestEducQuali() {
		return highestEducQuali;
	}

	public void setHighestEducQuali(String highestEducQuali) {
		this.highestEducQuali = highestEducQuali;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	


   public Student(String name,String maritalStatus,String age, String sex, String dob, String address, String primaryEmailID, String secondaryEmailID, String phoneNumber, String highestEducQuali, String nationality) {
	   this.name=name;
	   this.maritalStatus=maritalStatus;
	   this.age=age;
	   this.sex=sex;
	   this.dob=dob;
	   this.address=address;
	   this.primaryEmailID=primaryEmailID;
	   this.secondaryEmailID=secondaryEmailID;
	   this.phoneNumber=phoneNumber;
	   this.highestEducQuali=highestEducQuali;
	   this.nationality=nationality;   
	   
	   
	   
   }
	//Student student=new Student();
	
	public void registerStudent(){
		Registrar.getRegistrar().registerStudent(Student);
		
	}

    public void registerForExam(){
		
	}


    public void appearForExam(){
	
  }
    
    public static void main(String[] args) {
		Subject.addSubject("maths");
		Subject.addSubject("sce");
		Subject.addSubject("eng");
		Subject.delSubject("sceew");
		
	}
    
    
    
    

}
