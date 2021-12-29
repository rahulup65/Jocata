package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;



//import net.sf.ehcache.hibernate.EhCacheRegionFactory;

public class SecondCacheExample {

	//EhCacheRegionFactory// we used this because we have configure the hibernate.cfg.xml so we used the class name with fully package
	
	
	
	
	public static void main(String [] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		
		StudentCache student=new StudentCache("Rahul","varanasi");
	
		//>>>>>>>>>>>>>>>>>>firstlevelCache>>>>>>>>>>>>>>>>>>>>>//
		Session session1=factory.openSession();
		session1.save(student);

		
						StudentCache studentCache = session1.get(StudentCache.class, 1);
						System.out.println(studentCache);
						session1.close();
						
						
						
		// the object is present the sessionfactory object it will not fire the query for same object it means second level cache is enabled	
		Session session2=factory.openSession();
		
		StudentCache studentCache1 = session2.get(StudentCache.class, 1);
		System.out.println(studentCache1);
		session2.close();
	
		// we are getting the same object with the help of session2 object without run the query again because it will present in the session factory object from there it will get the data no need to hit the database
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
