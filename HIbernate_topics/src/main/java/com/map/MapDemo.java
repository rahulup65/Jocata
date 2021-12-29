package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	
	public static void main(String[] args) {
		
		
		Configuration cfg= new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		//creating question class object_____//
		Question q1=new Question();
		q1.setQuestionId(112);
		q1.setQuestion("what is java");
		
		
		//_____Creating the object of answer class_____//
		Answer answer= new Answer();
		answer.setAnswerId(1);
		answer.setAnswer("java is programming language");
		answer.setQuestion(q1);
		q1.setAnswer(answer);
     
		
	
		Question q2=new Question();
		q2.setQuestionId(113);
		q2.setQuestion("what is python");
		
		
		Answer answer1= new Answer();
		answer1.setAnswerId(2);
		answer1.setAnswer("python is also  programming language");
															// here this is answer class and its primary key will be the foreign key in the question class
		answer1.setQuestion(q2);	
		q2.setAnswer(answer1);                              // this is one to one mapping and unidirectional mapping between the question table and answer table
		
		
		Transaction tx=s.beginTransaction();
		s.save(q1);
		s.save(q2);
		s.save(answer);
		s.save(answer1);
		
		
		tx.commit();
		
		Question newQ=(Question)s.get(Question.class, 112);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		 
		
		
		s.close();
		factory.close();
		
		
		
	}

}
