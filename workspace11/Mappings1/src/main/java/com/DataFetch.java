package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetoone.Employee;
import com.utils.HibernateUtils;

public class DataFetch {

	public static void main(String[] args) {


		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		Employee emp=(Employee) ses.load(Employee.class,10);
		
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDept().getDeptId());
		

	}

}
