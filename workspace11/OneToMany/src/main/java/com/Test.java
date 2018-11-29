package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.onetomany.Department;
import com.onetomany.Employee;
import com.utils.HibernateUtils;


public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		Employee emp=new  Employee(1,"pankaj",234554);
		Employee emp2=new  Employee(2,"pankaj2",2343654);
		Employee emp3=new  Employee(3,"pankaj3",7897);
		Employee emp4=new  Employee(4,"pankaj4",278908);
		
		
		
		Department d=new Department();
		d.setDeptId(2001);
		d.setDeptName("HR");
		
		

		d.getEmps().add(emp);
		d.getEmps().add(emp2);
		d.getEmps().add(emp3);
		d.getEmps().add(emp4);
		
		ses.save(d);
		
		ses.beginTransaction().commit();
		
		System.out.println("----- Done -----");
		
		
		HibernateUtils.shutdown();
		
		
		

	}

}
