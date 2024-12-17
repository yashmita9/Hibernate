package com.rays.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.rays.user.UserDTO;

public class TestGetLoad {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		
		UserDTO dto = (UserDTO) session.get(UserDTO.class, 10);  // output : null

//		UserDTO dto = (UserDTO) session.load(UserDTO.class, 10);  // output : objectNotFound Exception
		
		System.out.println(dto);
	}
	
}
