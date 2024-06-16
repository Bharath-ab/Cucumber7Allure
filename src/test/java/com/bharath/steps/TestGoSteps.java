package com.bharath.steps;

import io.cucumber.java.en.Given;
import io.qameta.allure.Step;

public class TestGoSteps {
    @Given("user say {string}")
    @Step("user say {string}")
    public void userSay(String greetings) {
        System.out.println(greetings);
    }
}
