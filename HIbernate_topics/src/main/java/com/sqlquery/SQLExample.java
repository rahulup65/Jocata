package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;



public class SQLExample {
	
	
	
	public static void main(String [] args) {
		
		
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		/// this is sql query______//
		String query="select * from students";
		
        NativeQuery nq=s.createSQLQuery(query);
        
            List<Object[]> st   =  nq.list();
            System.out.println(st);
            
            for(Object[] student:st) {
            	
            	
            	
            	System.out.println(Arrays.toString(student));
            }
		
		
		
		
		
		
		s.close();
		factory.close();
		
		
		
	}

}
