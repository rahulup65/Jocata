package com.HQL;




import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;


public class HQLExample {

	
	public static void main(String[] arg) {
		
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		//1..<<<<<<<<<<<<<<<<_________________getting data from the database using hql>>>>>>>>>>>>>>>>>___________________//
		
		
		
		
		
		String query="from Student where city='bhopal'";
		   Query q=s.createQuery(query);
		   
		   //single result(unique result)
		   //multiple result(list)
		   		List<Student> list1	=q.list();	
		   		
		   		for(Student a:list1) {
		   			
		   			System.out.println(a.getName());
		   			
		   		}
		   		
		   		
		   		
		   org.hibernate.Transaction tx= s.beginTransaction();		
		   	//2.._<<<<<<<<<<<<<<<<<___________________deleteing data from the db using hql>>>>>>>>>>>>>> _______________//
		   
		   
		   
		   
		   
//		   				Query q2=s.createQuery(" delete from Student as s where s.city=:c ");
//		   				
//		   				q2.setParameter("c","bhopal");
//		   				int r=q2.executeUpdate();
//		   				System.out.println("Deleted................");
//		   				System.out.println(r);
		   		
		   //3..>>>>>>>>>>>>>>_________update__<<<<<<<<<<<<<<<<<<<____________________________---//
		   
		   
		   
		   
		   
		   
//				Query q2=s.createQuery("update Student set city=:c where name =:n");
//		   		q2.setParameter("c", "varanasi");
//		   		q2.setParameter("n", "Ravi Tiwari");
//		   		int r=q2.executeUpdate();
//		   		System.out.println(r+"rows are updated");
		   
		   
		   
		   //4..>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>__________Join with HQl______<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<___//

		   	Query q3=s.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");				
		   					//_________here is q is the alias of question table or class _____________//
		   		List<Object[]> list3= q3.getResultList();	
		   		for( Object[] arr:list3) {
		   			
		   			
		   			System.out.println(Arrays.toString(arr));
		   		}
		   		
						
		tx.commit();
		s.close();
		
		factory.close();
	}
	
	
	
}
