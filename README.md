# DOJO TDD Batch 74

## Tech Stack
- Java JDK 8
- Gradle 7.0.2
- JUnit 5

## Prerequisites
- Install Java JDK 8
- Install Intellij Community

## Gradle tasks
```./gradle tasks --all``` list all tasks

```./gradlew clean build``` compile and run the unit test suite

```./gradlew clean build -x test``` compile the project and skip the test suite

```./gradlew test``` run the unit test suite

## Description
This is a code base for TDD practices using Discount Calculator DOJO.

A popular store create a discount program to improve its sales. For this, the store need a discount calculator based on rules of its discount program.<br/>

1. **Given that** the customer bought value is until $499.99 <br/>
   **When** close the sell <br/>
   **Then** not give discount <br/>

2. **Given that** the customer bought value starting $500.00  <br/>
   **When** close the sell  <br/>
   **Then** give 10% of discount  <br/>

3. **Given that** the customer bought value starting $1000.00 <br/>
   **When** close the sell <br/>
   **Then** give 20% of discount  <br/>

4. **Given that** the customer bought value is less $500.00 <br/>
   **When** close the sell <br/>
   **Then** give 5% of discount  <br/>