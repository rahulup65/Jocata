package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student1= new Student();
		student1.setName("Ankit Tiwari");
		student1.setCity("bhopal");
		
		
		Student student2= new Student();
		student2.setName("Ravi Tiwari");
		student2.setCity("praygraj");
		 
		

		Student student3= new Student();
		student3.setName("Ravi Tiwari");
		student3.setCity("praygraj");
		
		

		Student student4= new Student();
		student4.setName("Ravi Tiwari");
		student4.setCity("praygraj");
		

		Student student5= new Student();
		student5.setName("Ravi Tiwari");
		student5.setCity("praygraj");
		

		Student student6= new Student();
		student6.setName("Ravi Tiwari");
		student6.setCity("praygraj");
		

		Student student7= new Student();
		student7.setName("Ravi Tiwari");
		student7.setCity("praygraj");
		

		Student student8= new Student();
		student8.setName("Ravi Tiwari");
		student8.setCity("praygraj");
		
		

		Student student9= new Student();
		student9.setName("Ravi Tiwari");
		student9.setCity("praygraj");
		

		Student student10= new Student();
		student10.setName("Ravi Tiwari");
		student10.setCity("praygraj");
		

		Student student11= new Student();
		student11.setName("Ravi Tiwari");
		student11.setCity("praygraj");
		
		

		Student student12= new Student();
		student12.setName("Ravi Tiwari");
		student12.setCity("praygraj");
		

		Student student13= new Student();
		student13.setName("Ravi Tiwari");
		student13.setCity("praygraj");
		

		Student student14= new Student();
		student14.setName("Ravi Tiwari");
		student14.setCity("praygraj");
		

		Student student15= new Student();
		student15.setName("Ravi Tiwari");
		student15.setCity("praygraj");
		

		Student student16= new Student();
		student16.setName("Ravi Tiwari");
		student16.setCity("praygraj");
		

		
		
//		Certificate certificate = new Certificate();
//		
//		certificate.setCourse("Android");
//		certificate.setDuration("2 months");
		//student1.setCerti(certificate);
		
		
//		Certificate certificate1 = new Certificate();
//
//		certificate1.setCourse("hibernat");
//		certificate1.setDuration("1.5 months");
		//student2.setCerti(certificate1);
		Session s = factory.openSession();
		Transaction tx= s.beginTransaction();
		//___we have to save the object_______//
		
		s.save(student1);
		s.save(student2);
		s.save(student3);
		s.save(student4);
		s.save(student5);
		s.save(student6);
		s.save(student7);
		s.save(student8);
		s.save(student9);
		s.save(student10);
		s.save(student11);
		s.save(student12);
		s.save(student13);
		s.save(student14);
		s.save(student15);
		s.save(student16);
		
		
		
		
		
		tx.commit();
		s.close();
		factory.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
