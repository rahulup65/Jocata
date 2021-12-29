package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        		Student student= new Student(12368,"Ritesh Gupta", "chittupur");
        		int r=studentDao.insert(student);
        		System.out.println("done"+r);
        		List<Student> students=studentDao.getAllStudents();
        		
        		for( int i =0;i<students.size();i++) {
        			
        			
        			System.out.println(students.get(i));
        		}
        		
        		
        
        
        
        
        
        
    }
}
