package com.airline;

import com.airline.service.PassengerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AirlineApp {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AirlineApp.class, args);
		
		PassengerService service = ctx.getBean(PassengerService.class);
		service.displayPassengerInfo();	
	}
}
