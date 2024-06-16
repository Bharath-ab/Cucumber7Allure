package com.bharath.steps;

import com.bharath.util.TestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class SampleSearchSteps extends TestUtility {
    WebDriver driver;
    WebDriverWait wait;



    @Given("User launch {string} browser")
    @Step("User launch {string} browser")
    public void userLaunchBrowser(String browser) {
        driver = launchWebDriver(browser);
    }

    @Then("User navigate to url {string}")
    @Step("User navigate to url {string}")
    public void userNavigateToUrl(String url) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @Then("User search for text {string}")
    @Step("User search for text {string}")
    public void userSearchForText(String searchText) {
//                driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(searchText);
//                driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@title='Search']"))).sendKeys(searchText);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@title='Search']"))).sendKeys(Keys.ENTER);

    }

    @Then("User verify page is opened")
    @Step("User verify page is opened")
    public void userVerifyPageIsOpened() {
//        driver.findElement(By.xpath("//h3[text()='Cat - Wikipedia']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Cat - Wikipedia']")));
    }

    @Then("User close the browser")
    @Step("User close the browser")
    public void userCloseTheBrowser() {
        System.out.println("Clean Up");
    }


}
