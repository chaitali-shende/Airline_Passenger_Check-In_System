package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.config.PassengerConfig;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor  // Injects final fields automatically
public class PassengerService {
	@Autowired
	private final PassengerConfig passengerConfig;

	public void displayPassengerInfo() {

        System.out.println("\n===================================");
        System.out.println("Airline Check-In Details:");
        System.out.println("===================================\n");
        System.out.println("Passenger ID     : " + passengerConfig.getPassengerId());
        System.out.println("Passenger Name   : " + passengerConfig.getPassengerName());
        System.out.println("Flight No        : " + passengerConfig.getFlight());

        System.out.println("\nSeat Preferences : " + passengerConfig.getSeatPreferences());

        System.out.print("Baggage Weights  : ");
        for (double w : passengerConfig.getBaggageWeights()) {
            System.out.print(w + " ");
        }
        System.out.println();

        System.out.println("Special Help     : " + passengerConfig.getSpecialAssistance());

        System.out.println("Meal Choices     :");
        passengerConfig.getMeals()
                .forEach((k, v) -> System.out.println("   " + k + " = " + v));

        System.out.println("Travel History   :");
        passengerConfig.getHistory()
                .forEach((k, v) -> System.out.println("   " + k + " = " + v));
    }
}
