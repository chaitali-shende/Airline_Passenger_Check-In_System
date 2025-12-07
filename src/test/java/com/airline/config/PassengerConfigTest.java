package com.airline.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PassengerConfigTest {

    @Autowired
    private PassengerConfig config;

    @Test
    void testPassengerConfigLoaded() {

        assertNotNull(config, "PassengerConfig bean should be initialized");

        assertEquals(8742, config.getPassengerId());
        assertEquals("Meera Joshi", config.getPassengerName());
        assertEquals("AI-203", config.getFlight());

        // List Test
        assertEquals(2, config.getSeatPreferences().size());
        assertEquals("Window", config.getSeatPreferences().get(0));

        // Array Test
        assertEquals(12.5, config.getBaggageWeights()[0]);
        assertEquals(7.8, config.getBaggageWeights()[1]);

        // Set Test
        assertEquals(true, config.getSpecialAssistance().contains("Wheelchair"));

        // Map Test
        assertEquals("Asian Vegetarian", config.getMeals().get("veg"));
        assertEquals(3, config.getHistory().get("2022"));
    }
}
