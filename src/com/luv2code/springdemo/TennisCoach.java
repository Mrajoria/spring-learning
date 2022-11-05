package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a default constructor below
	 public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	//define a setter method to instantiate FortuneService
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method ");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practise your backhand volley";
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
