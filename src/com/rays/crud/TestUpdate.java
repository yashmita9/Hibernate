
package com.rays.crud;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.rays.user.UserDTO;

import org.hibernate.cfg.Configuration;

public class TestUpdate {

	public static void main(String[] args) {
	
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("avnish");
		dto.setLastName("patel");
		dto.setLoginId("avnish@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(dto);
		tx.commit();
		session.close();
		
	}
	
	
	
}
