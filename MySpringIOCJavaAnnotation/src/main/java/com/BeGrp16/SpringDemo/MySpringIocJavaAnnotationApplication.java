package com.BeGrp16.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class MySpringIocJavaAnnotationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MySpringIocJavaAnnotationApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//runs default .. calls FootBallCoach.. output :  10 rounds of field..
		//Coach thecoach=context.getBean("footBallCoach", Coach.class);
		
		//runs componet("MyCoach") ie. TrackCoach.java  output: run 5k
		Coach thecoach=context.getBean("MyCoach", Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		context.close();
	}

}
