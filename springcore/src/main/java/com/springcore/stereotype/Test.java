package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		
		Student student1 =(Student)context.getBean("student");
		System.out.println(student1);
		System.out.println(student1.hashCode());
		
		Student student2 =(Student)context.getBean("student");
		System.out.println(student2.hashCode());
		
		
		
		
	}

}
