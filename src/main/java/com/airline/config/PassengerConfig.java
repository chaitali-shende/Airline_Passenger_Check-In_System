package com.airline.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "airline")
@Data                       // Generates getters, setters, toString, equals, hashCode
public class PassengerConfig {

    private int passengerId;
    private String passengerName;
    private String flight;

    private List<String> seatPreferences;
    private double[] baggageWeights;
    private Set<String> specialAssistance;

    private Map<String, String> meals;
    private Map<String, Integer> history;
}
