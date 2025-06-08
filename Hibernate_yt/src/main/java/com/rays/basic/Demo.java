package com.rays.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("Project Started ....");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Student st = new Student();
		
		st.setId(102);
		st.setName("Rani");
		st.setCity("indore");
		
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		
		
		System.out.println(sf);
	}

}
