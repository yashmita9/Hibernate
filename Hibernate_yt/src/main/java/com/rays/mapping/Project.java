package com.rays.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int id;

	private String Project_name;
	
	@ManyToMany(mappedBy = "pro")
	private List<Employee> emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String project_name, List<Employee> emp) {
		super();
		this.id = id;
		Project_name = project_name;
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject_name() {
		return Project_name;
	}

	public void setProject_name(String project_name) {
		Project_name = project_name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
}
