package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor below
	 public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	 
	 //define my init method
	 @PostConstruct
	 public void doMyStartupStuff(){
		 System.out.println(">> TennisCoach: inside init method");
	 }
	 
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	 
	//define a setter method to instantiate FortuneService
	 /*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method ");
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "practise your backhand volley";
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside destory method");
	}
	

}
