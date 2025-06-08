package com.rays.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.mapping.Answer;
import com.rays.mapping.Question;

public class Cascading {
	
	public static void main(String[] args) {
		  
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Question q = new Question();
		q.setId(56);
		q.setQues("what is cascade?");
		
		Answer a = new Answer();
		a.setId(123);
		a.setAns("first");
		
		Answer a1 = new Answer();
		a1.setId(25);
		a1.setAns("secound");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		
		q.setAns(list);
		Transaction tx = s.beginTransaction();
		s.save(q);
		tx.commit();
		
		
		s.close();
		sf.close();
		
	}

}
