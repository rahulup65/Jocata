package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		
		Emp e1= new Emp();
		Emp e2 =new Emp();
		e1.setEid(36);
		e1.setEname("Ram");
		e2.setEid(35);
		e2.setEname("shyam");
		
		
		
		Project p1=new Project();
		Project p2= new Project();	
		p1.setPid(1212);
		p1.setProjectName("Library Managment System");
		p2.setPid(1421);
		p2.setProjectName("CHATBOT");
		
		List<Emp> list1=new ArrayList<Emp>();
		
		List<Project> list2=new ArrayList<Project>();
		
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		
		e1.setProjects(list2);
		p1.setEmps(list1);
		e2.setProjects(list2);
		p1.setEmps(list1);
		
		
		
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		
		tx.commit();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
