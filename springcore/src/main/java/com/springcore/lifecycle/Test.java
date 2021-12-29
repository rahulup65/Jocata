package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/initconfig.xml");
		
	Samosaa s1= (Samosaa)context.getBean("per");
		System.out.println(s1);
		context.registerShutdownHook();
		
		
		Example example=(Example)context.getBean("example");
		System.out.println(example);
		
		
		
	}

}
