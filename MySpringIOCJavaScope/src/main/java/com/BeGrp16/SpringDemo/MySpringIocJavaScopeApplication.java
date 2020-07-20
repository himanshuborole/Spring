package com.BeGrp16.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MySpringIocJavaScopeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MySpringIocJavaScopeApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach theCoach=context.getBean("MyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		/*	used to check the Scope program....
		 * Coach theCoach=context.getBean("MyCoach", Coach.class);
		Coach alphaCoach=context.getBean("MyCoach", Coach.class);
		boolean results=(theCoach==alphaCoach);
		//print the result
		System.out.println("Pointing to the same object ="+results);
		//print the memory location
		System.out.println("\nMemory location for theCoach ="+theCoach);
		System.out.println("\nMemory location for alphaCoach ="+alphaCoach);*/
		//close the context
		context.close();
	}

}
// when we specify singleton the memory location of both obj (theCoach and alphaCoach) is same
// when we specify prototype the memory location of both obj (theCoach and alphaCoach) is different
// singleton scope call the init method and destroy method
// while prototype scope doesnot call the destroy method...