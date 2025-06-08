package com.rays.Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rays.basic.Student;

public class Fatching {
	
	public static void main(String[] args) {
		
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Student st = (Student)session.get(Student.class, 101);
		System.out.println(st);
		
	}

}
