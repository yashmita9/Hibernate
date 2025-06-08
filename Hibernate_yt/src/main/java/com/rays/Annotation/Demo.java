package com.rays.Annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started ....");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Address add = new Address();
		add.setCity("Indore");
		add.setStreet("Street1");
		add.setX(1.55);
		add.setOpen(false);
		add.setAddedDate(new Date());
		
		//Reading Image
		FileInputStream file = new FileInputStream("src/main/resources/mor.jpg");
		byte[] data = new byte[file.available()];
		file.read();
		add.setImage(data);
		
		Transaction tx = session.beginTransaction();
		session.save(add);
		tx.commit();
		
		session.close();
		
		
		System.out.println(sf);
	}

}
