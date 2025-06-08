package com.ray.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class secoundchache {
	
	public static void main(String[] args) {
	
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
		Student s1 = session.get(Student.class, 1);
		System.out.println(s1);

		session.close();
		
		Session session1 = sf.openSession();
		Student s2 = session.get(Student.class, 1);
		System.out.println(s2);

		session.close();
		
	}

}
