package com.coursespring.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout()
	{
		return "Spends 30 minutes on batting practice";
	}
}
