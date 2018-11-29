package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Department {

	@Id
	private int deptId;
	private String deptName;
	
	
	
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}