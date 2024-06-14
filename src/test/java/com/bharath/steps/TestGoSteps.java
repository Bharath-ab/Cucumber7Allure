package com.bharath.steps;

import io.cucumber.java.en.Given;

public class TestGoSteps {
    @Given("user say {string}")
    public void userSay(String greetings) {
        System.out.println(greetings);
    }
}
