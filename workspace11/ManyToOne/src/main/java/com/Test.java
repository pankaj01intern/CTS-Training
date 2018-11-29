package com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import com.manytoone.Department;
import com.manytoone.Employee;
import com.utils.HibernateUtils;


public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		Employee emp=new  Employee(1,"pankaj",234554);
		
		
		Department d=new Department();
		Department d2=new Department();
		Department d3=new Department();
		
		d.setDeptId(2001);
		d.setDeptName("HR");
		d2.setDeptId(2002);
		d2.setDeptName("HR2");
		d3.setDeptId(2003);
		d3.setDeptName("HR3");
		
		

		emp.getDep().add(d);
		emp.getDep().add(d2);
		emp.getDep().add(d3);
		
		ses.save(emp);
		
		ses.beginTransaction().commit();
		
		System.out.println("----- Done -----");
		
		
		HibernateUtils.shutdown();
		
		
		

	}

}
