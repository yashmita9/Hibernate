package com.rays.fatching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Egerfatch {
	
public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Question q = session.get(Question.class, 101);
	System.out.println(q.getQues());
	System.out.println(q.getId());
	
	//Eger Loading...
	System.out.println(q.getAns().size());
	}


}
