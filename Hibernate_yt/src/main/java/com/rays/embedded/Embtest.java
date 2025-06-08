package com.rays.embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embtest {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Student st = new Student();
		st.setId(105);
		st.setCity("bhopal");
		st.setName("prince");
		
		Certificate c = new Certificate();
		c.setCourse("BCA");
		c.setDuration("2 year");
		
		st.setCerti(c);
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
	}
	
}
