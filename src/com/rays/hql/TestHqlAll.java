package com.rays.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestHqlAll {

    public static void main(String[] args) {
        
        // Create SessionFactory
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
        // Open a session
        Session session = sf.openSession();
        
        // Begin transaction
        Transaction tx = session.beginTransaction();
        
        try {
            // Correct HQL query
            Query q = session.createQuery("from UserDTO");
            
            // Fetch list of results
            List list = q.list();
            
            // Iterate through the results
            Iterator it = list.iterator();
            
            while(it.hasNext()) {
                UserDTO dto = (UserDTO) it.next();
                
                // Print user details
                System.out.print(dto.getId());
                System.out.print("\t" + dto.getFirstName());
                System.out.print("\t" + dto.getLastName());
                System.out.print("\t" + dto.getLoginId());
                System.out.print("\t" + dto.getPassword());
                System.out.print("\t" + dto.getDob());
                System.out.println("\t" + dto.getAddress());
            }
            
            // Commit the transaction
            tx.commit();
        } catch (Exception e) {
            // Rollback transaction in case of error
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            // Close session
            session.close();
        }
    }
}
