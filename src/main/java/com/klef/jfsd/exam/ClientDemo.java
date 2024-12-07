package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		Vehicle p = new Vehicle();
		p.setName("Porshe");
		p.setColor("Red");
		p.setMaxspeed(340);
		p.setType("Sport");
		
		Car s = new Car();
		s.setNoofdoors("2");

		
		Truck t = new Truck();
		t.setLoadcapacity("45000");

		
		session.persist(p);
		session.persist(s);
		session.persist(t);
		
		System.out.println("Success..");
		
		transaction.commit();
		session.close();
		sf.close();
	}
}
