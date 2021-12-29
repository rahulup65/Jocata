package com.tut;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	
	
	
	 public static void main( String[] args )throws IOException
	    {
	      
	        
	        Configuration cfg=new Configuration();//configuration is the class
	        
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        Session session=factory.openSession();
	        
	        //________get() method_______//
//	        Student student=(Student)session.get(Student.class,1);
//	        //____only one time select query will be performed because second time it will see the cache not hit the database it just see the session cache
//	        
//	        Student student1=(Student)session.get(Student.class, 1);
	        
	        //___load() methods____//
	        
	        Student student =(Student)session.load(Student.class, 1);
	        
	   //here if we will not use the student object so  it will not fire the query if use student object then only query will be fire or database will be hit 
	        
	        //System.out.println(student);
	        //System.out.println(student1);
	        
	        
	
	        session.close();
	        factory.close();
	        
	        
	        
	
	    }
	
	
	
	
	
	
	
	

}
