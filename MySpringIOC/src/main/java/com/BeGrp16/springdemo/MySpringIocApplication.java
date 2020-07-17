package com.BeGrp16.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MySpringIocApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach thecoach=context.getBean("MyCoach", Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		context.close();
	}

}
