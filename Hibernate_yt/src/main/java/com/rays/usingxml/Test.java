package com.rays.usingxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Person p = new Person();
		p.setId(1);
		p.setName("pooja");
		p.setAddress("bhopal");
		p.setPhone("9988774455");
		
		s.save(p);		
		tx.commit();
		
		s.close();
		sf.close();
		
		
	}

}
