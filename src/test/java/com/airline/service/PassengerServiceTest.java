package com.airline.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PassengerServiceTest {

    @Autowired
    private PassengerService service;

    // To capture console output
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setupStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testDisplayPassengerInfo() {

        service.displayPassengerInfo();

        String output = outputStream.toString();

        // Basic validation
        assertTrue(output.contains("Airline Check-In Details"));
        assertTrue(output.contains("Passenger ID     : 8742"));
        assertTrue(output.contains("Passenger Name   : Meera Joshi"));
        assertTrue(output.contains("Flight No        : AI-203"));

        // Seat Preferences
        assertTrue(output.contains("Seat Preferences : [Window, Extra Legroom]"));

        // Baggage
        assertTrue(output.contains("Baggage Weights  : 12.5 7.8"));

        // Special Assistance
        assertTrue(output.contains("Special Help     : [Wheelchair, Priority Boarding]"));

        // Meal Map
        assertTrue(output.contains("veg = Asian Vegetarian"));
        assertTrue(output.contains("drink = Orange Juice"));
        assertTrue(output.contains("dessert = Chocolate Mousse"));

        // History Map
        assertTrue(output.contains("2022 = 3"));
        assertTrue(output.contains("2023 = 5"));
    }
}
