package com.rays.test;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.rays.user.UserDTO;

public class TestFlush {

	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO();
		
		dto.setFirstName("abhinandan");
		dto.setLastName("singh");
		dto.setLoginId("abhinandan@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
// without flush sequence mai run nhi hota save query last me chalti hai 
		session.save(dto);
		
		session.flush();
		
		System.out.println("id = " +dto.getId());
		
		dto = (UserDTO) session.get(UserDTO.class, 2);

		System.out.println("first name = " + dto.getFirstName());

		tx.commit();

		session.close();

		
	}
	
}
