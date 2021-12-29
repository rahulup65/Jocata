package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {

	
	public static void main(String[] args)
	{
		//----------hibernate object states-------------//
		// trasient state
		// persistence state
		// detached state
		// removed state
	System.out.println(" example");
	
	
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory f = cfg.buildSessionFactory();
	
	Student student=new Student();
	student.setId(1414);
	student.setName("Peter");
	student.setCity("ABC");
	//student.setCerti(new Certificate("java hibernate course","2 months"));
	
	//__ Now the the object student is now in transient state now it is not associated with database and session object
	
	
	
	Session s=f.openSession();
	Transaction tx= s.beginTransaction();
	s.save(student);//now the student object associate with session object and database also 
	
	
	student.setName("john");
	
	tx.commit();
	s.close();// session is close and the object student is come in the detached state and the object is present in the database
	
	f.close();
	}	
}
