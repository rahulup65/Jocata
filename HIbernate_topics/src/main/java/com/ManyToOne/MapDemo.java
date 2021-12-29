package com.ManyToOne;

import java.util.ArrayList;
import java.util.List;

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
		
		
		Answer answer1= new Answer();
		answer1.setAnswerId(2);
		answer1.setAnswer("with the help of java we can create java  Softwares");
		answer1.setQuestion(q1);
		
		
		Answer answer2= new Answer();
		answer2.setAnswerId(3);
		answer2.setAnswer("java has different types of framework");
		answer2.setQuestion(q1);
		
		List<Answer> list=  new ArrayList<Answer>();
		
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		q1.setAnswers(list);
		Transaction tx=s.beginTransaction();
		s.save(q1);
		s.save(answer);
		s.save(answer1);
		s.save(answer2);
		
		
		
//			Question q=(Question)s.get(Question.class,112);
//			System.out.println(q.getQuestion());
//			System.out.println(q.getQuestionId());
		
			//______Lazy Loading is happing here_________//
			
			//System.out.println(q.getAnswers().size()); //Now it will load the data because i used getAnswer that is why it is called lazy loading 
	
		
		
		tx.commit(); 
		s.close();
		factory.close();
		
		
		
	}

}

