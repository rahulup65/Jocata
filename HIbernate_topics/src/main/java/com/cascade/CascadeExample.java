package com.cascade;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CascadeExample {
	
	
	
	public static void main(String [] args) {
		
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session s= factory.openSession();
		
				Question1 q1=new Question1();
				q1.setQuestionId(567);
				q1.setQuestion("what is cascading");
				
				
				Answer1 a1= new Answer1(23423,"In hibernate it is important concept");
				Answer1 a2= new Answer1(255,"second answer");
				Answer1 a3= new Answer1(35,"third answer");
				
				List<Answer1> list=  new ArrayList<Answer1>();
				list.add(a1);
				list.add(a2);
				list.add(a3);
				
				q1.setAnswers(list);
//				a1.setQuestion(q1);
//				a2.setQuestion(q1);
//				a3.setQuestion(q1);
		
				
				Transaction tx= s.beginTransaction();
			    s.save(q1);// no need to save or persist because we used cascade All so accordingly answer will be save for question and delete(ALL, it means all operations)
//				s.save(a1);
//				s.save(a2);
//				s.save(a3);
				
	
		tx.commit();
		s.close();
	
		factory.close();
		
		
		
		
		
		
		
		
		
	}

}
