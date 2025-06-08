package com.rays.sqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SqlEx {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Query q = s.createSQLQuery("select * from student");
		List<Object[]> list = q.list();
		for(Object[] stu : list) {
			System.out.println(stu[4] + " : " + stu[3]);
		}
		s.close();
		sf.close();
		
		
		
		
	}

}
