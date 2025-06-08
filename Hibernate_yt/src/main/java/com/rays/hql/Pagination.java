package com.rays.hql;

import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Pagination {
	
	public static void main(String[] args) {
		
		
		 SessionFactory sf  = new Configuration().configure().buildSessionFactory();
		 Session s = sf .openSession();
		 
		 Query q = s.createQuery("from Student");
		 q.setFirstResult(1);
		 q.setMaxResults(5);
		 List<Student> list = q.list();
		 for(Student stu : list) {
			 System.out.println(stu.getName());
		 }
		 
		 
		 sf.close();
	}

}
