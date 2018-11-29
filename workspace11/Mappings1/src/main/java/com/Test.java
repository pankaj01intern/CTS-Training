package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoone.Department;
import com.onetoone.Employee;
import com.onetoone.Project;
import com.utils.HibernateUtils;


public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		Employee emp=new  Employee();
		
		emp.setEmpId(166);
		emp.setEmpName("pankaj");
		emp.setSalary(43545);
		
		
		
		Department d=new Department();
		d.setDeptId(2001);
		d.setDeptName("HR");
		
		Project p=new Project();
		p.setProjId(101);
		p.setProjName("Amex");
		
		d.setProj(p);
		
		
		emp.setDept(d);
		
		ses.save(emp);
		
		ses.beginTransaction().commit();
		
		System.out.println("----- Done -----");
		
		
		HibernateUtils.shutdown();
		
		
		

	}

}
