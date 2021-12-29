package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstDemo {
	
	public static void main(String [] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		
		
					Student student = s.get(Student.class, 7);
					System.out.println(student);
					
					
					System.out.println("working with something");
					
					
					// this is the first level cache it will hit the db or run the select queries again
					// we check the objects in the cache memory with the contain
					
					
					Student student1 = s.get(Student.class, 7);// query will not fire for the same object it will take the data from the session object only
					System.out.println(student1);
					System.out.println(s.contains(student1));
					
					
					
					
					
	
		
		
		
		
		
		
		
		
		
		
		
		
		s.close();
		factory.close();
	
		
	}

}
