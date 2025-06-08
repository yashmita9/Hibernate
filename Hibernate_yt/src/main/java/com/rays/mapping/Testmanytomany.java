package com.rays.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testmanytomany {
	
	public static void main(String[] args) {
	
	SessionFactory sf =new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	
	Employee e1 = new Employee();
	e1.setId(1);
	e1.setEmp_name("ram");
	
	Employee e2 = new Employee();
	e2.setId(2);
	e2.setEmp_name("pooja");
	
	Project p = new Project();
	p.setId(30);
	p.setProject_name("library");
	
	Project p2 = new Project();
	p2.setId(21);
	p2.setProject_name("ORS");
	
	List<Project> list =new ArrayList<Project>();
	List<Employee> list1 = new ArrayList<Employee>();
	
	list.add(p);
	list.add(p2);
	list1.add(e1);
	list1.add(e2);
	
	e1.setPro(list);
//	e2.setPro(list);
//	p2.setEmp(list1);
	p.setEmp(list1);
	
	Transaction tx = session.beginTransaction();
	session.save(e1);
	session.save(e2);
	session.save(p);
	session.save(p2);
	
	
	tx.commit();
	
	}

}
