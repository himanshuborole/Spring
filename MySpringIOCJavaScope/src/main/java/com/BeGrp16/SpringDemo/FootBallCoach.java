package com.BeGrp16.SpringDemo;

import org.springframework.stereotype.Component;


public class FootBallCoach implements Coach {
	public String getDailyWorkout() {
		return(" 10 rounds of field..");
	}
	public void MyInitializeMethod() {
		System.out.println("Inside the intialize method");
	}
	public void MyDestroyMethod() {
		System.out.println("Inside the destroy method");
	}

}
