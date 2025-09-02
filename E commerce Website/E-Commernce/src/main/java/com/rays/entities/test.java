package com.rays.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	
	public static void main(String[] args) {
		user();
	}

	private static void user() {
		User user = new User();
		user.setUserName("aman");
		user.setUserPassword("123");
		user.setUserAddress("indore");
		user.setUserEmail("amanyashona@gmail.com");
		user.setUserPic("user");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(user);

		tx.commit();

		session.close();
	}

}
