package com.bharath.steps;

import com.bharath.util.TestUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;


public class Hooks {
    @Before
    public void before() {
        System.out.println("This is before Hook");
    }

    @After(order = 1)
    public void takeScreenShort(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) TestUtility.WebDriverForScreenShort;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
            Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(ts.getScreenshotAs(OutputType.BYTES)));
        }
    }

    @After(order = 0)
    public void tearDown() {
        System.out.println("This is after hook");
        TestUtility.WebDriverForScreenShort.close();
        TestUtility.WebDriverForScreenShort.quit();
    }
}
