package com.pagination;

import org.hibernate.query.*;

import com.tut.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPagination {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		
		//__-----pagination-------------------//
		
		
					  Query query=session.createQuery("from Student");
					  
					  query.setFirstResult(0);
					  query.setMaxResults(10);
					  
					  
					  List<Student> list=query.list();
							  
							  for(Student st:list) {
								  
								  
								  System.out.println(st.getId()+" : "+st.getName()+" :  "+st.getCity());
							  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		factory.close();
	}

}
