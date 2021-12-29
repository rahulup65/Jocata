package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "my program started" );
        
        
        // getting the object of  jdbcTemplate  class and performing the database operations like insert delete and update
       // ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
        ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);

		// JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		// insert query
		// String query="insert into student(id,name,city) values(?,?,?)";
		// fire query

		// int result=template.update(query,458,"vineet tiwari","reva");
		// System.out.println("number of rows is effected "+result);
//        				StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        				Student student= new Student();
//        				student.setId(666);
//        				student.setName("rahulgupta");
//        				student.setCity("city");     				
//        				int result=studentDao.insert(student);
//        				System.out.println("result added "+result);
        				
        //updating the data 
        
//        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
//        Student student= new Student();
//        student.setId(456);
//        student.setName("ritesh");
//        student.setCity("Banaras");
//        int result=studentDao.change(student);
//        System.out.println("data changed " +result);

		// deleting the data from the database

//        
//        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//        int result=studentDao.delete(457);
//        System.out.println("deleted "+result);

		// selecting single row from the database
//        
//        StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
//        Student student=studentDao.getStudent(666);
//        System.out.println(student);

		// selecting multiple rows from the database

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		List<Student> students = studentDao.getAllStudents();
		for (int i = 0; i < students.size(); i++) {

			System.out.println(students.get(i));

		}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
