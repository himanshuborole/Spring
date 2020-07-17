package com.BeGrp16.SpringDemo;

import org.springframework.stereotype.Component;

@Component("MyCoach")
public class TrackCoach implements Coach{
	public String getDailyWorkout() {
		return("run 5k");
	}

}
