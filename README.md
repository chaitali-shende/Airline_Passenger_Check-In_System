# ✈️ Airline Passenger Check-In System  
A Spring Boot project demonstrating **@ConfigurationProperties**, **YAML-based configuration**, **Lombok**, and **JUnit 5 testing**.  
The application loads airline passenger check-in details from `application.yml` and displays structured output using a service layer.

---

## 📌 Features
- Loads complex structured data (List, Set, Array, Map) from **application.yml**
- Uses **@ConfigurationProperties** with **Lombok @Data** for clean POJOs
- Uses **Lombok @RequiredArgsConstructor** for dependency injection
- Fully tested with **JUnit 5**
- Console-based output of passenger check-in details
- Clean & modular Spring Boot structure

---

## 📂 Project Structure

src/main/java/com/airline

│── AirlineApp.java

│

├── config

│ └── PassengerConfig.java

│

└── service

└── PassengerService.java


src/test/java/com/airline

│── config

│ └── PassengerConfigTest.java

│

└── service

└── PassengerServiceTest.java

---

## 🧩 `application.yml` Configuration

airline:
  passenger-id: 8742
  passenger-name: Meera Joshi
  flight: AI-203

  seat-preferences:
    - Window
    - Extra Legroom

  baggage-weights:
    - 12.5
    - 7.8

  special-assistance:
    - Wheelchair
    - Priority Boarding

  meals:
    veg: Asian Vegetarian
    drink: Orange Juice
    dessert: Chocolate Mousse

  history:
    2022: 3
    2023: 5

---

## 🛠️ Technologies Used

Java 17+

Spring Boot 3.x

Lombok

JUnit 5

YAML configuration

Maven

---

## 📌 Expected Console Output

===================================
Airline Check-In Details:
===================================

Passenger ID     : 8742
Passenger Name   : Meera Joshi
Flight No        : AI-203

Seat Preferences : [Window, Extra Legroom]
Baggage Weights  : 12.5 7.8
Special Help     : [Wheelchair, Priority Boarding]

Meal Choices     :
   veg = Asian Vegetarian
   drink = Orange Juice
   dessert = Chocolate Mousse

Travel History   :
   2022 = 3
   2023 = 5

---

## 🧪 JUnit Tests Included

✔ PassengerConfigTest

Validates all YAML properties

Tests lists, sets, arrays, and maps

Ensures Spring Boot correctly binds configuration

✔ PassengerServiceTest

Captures console output

Verifies formatted passenger details

Ensures all sections print correctly

---

## 📦 Maven Dependencies

<!-- Lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
    <scope>provided</scope>
</dependency>

<!-- Spring Boot Configuration Processor -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>

<!-- JUnit Jupiter -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <scope>test</scope>
</dependency>



