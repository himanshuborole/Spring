package com.BeGrp16.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {
	public String getDailyWorkout() {
		return(" 10 rounds of field..");
	}

}
