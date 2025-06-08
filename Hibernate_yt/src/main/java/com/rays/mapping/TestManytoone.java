package com.rays.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestManytoone {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Question q = new Question();
//		
//		q.setId(101);
//		q.setQues("what is java?");
//		
//		Answer ans = new Answer();
//		ans.setId(1);
//		ans.setAns("java is programing language");
//		ans.setQues(q);
//		
//		Answer ans1 = new Answer();
//		ans1.setId(2);
//		ans1.setAns("java is based on oops");
//		ans1.setQues(q);
//		
//		Answer ans2 = new Answer();
//		ans2.setId(3);
//		ans2.setAns("java has many functioanality");
//		ans2.setQues(q);
//		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(ans);
//		list.add(ans1);
//		list.add(ans2);
//		
//		q.setAns(list);
//		
//		Transaction tx = session.beginTransaction();
//		session.save(q);
//		session.save(ans);
//		session.save(ans1);
//		session.save(ans2);
//		
//		tx.commit();
		
		
		
		//Fatching the data.............
			q = session.get(Question.class, 101);
			System.out.println(q.getQues());
			
			for (Answer a : q.getAns()) {
				System.out.println(a.getAns());
			}
		
	}

}
