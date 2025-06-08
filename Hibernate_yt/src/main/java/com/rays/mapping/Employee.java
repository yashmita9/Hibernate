package com.rays.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	private String emp_name;
	
	@ManyToMany
	@JoinTable(name = "emp_learn") //for changing name
	private List<Project> pro;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String emp_name, List<Project> pro) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.pro = pro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<Project> getPro() {
		return pro;
	}

	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	
	

}
