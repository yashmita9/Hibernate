package com.rays.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Question q1 =new Question();
		q1.setId(101);
		q1.setQues("what is a java ?");
		
		Answer ans = new Answer();
		ans.setId(1);
		ans.setAns("this is a programming language");
		ans.setQues(q1);
		
//		q1.setAns(ans);
		
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(ans);		
		tx.commit();
		
		//fatching
		Question newq = session.get(Question.class, 101);
		System.out.println(newq.getQues());
//		System.out.println(newq.getAns().getAns());
	}

}
