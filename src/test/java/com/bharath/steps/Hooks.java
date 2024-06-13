package com.bharath.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before(){
        System.out.println("This is before Hook");
    }
    @After
    public void after(){
        System.out.println("This is after hook");
    }
}
