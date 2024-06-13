package com.bharath.steps;

import com.bharath.util.TestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SampleSearchSteps extends TestUtility {
    WebDriver driver;
    WebDriverWait wait;

    @Given("User launch {string} browser")
    public void userLaunchBrowser(String browser) {
        driver = launchWebDriver(browser);
    }

    @Then("User navigate to url {string}")
    public void userNavigateToUrl(String url) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.navigate().to(url);
        driver.manage().window().maximize();

    }

    @Then("User search for text {string}")
    public void userSearchForText(String searchText) {
//                driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(searchText);
//                driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@title='Search']"))).sendKeys(searchText);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@title='Search']"))).sendKeys(Keys.ENTER);

    }

    @Then("User verify page is opened")
    public void userVerifyPageIsOpened() {
//        driver.findElement(By.xpath("//h3[text()='Cat - Wikipedia']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Cat - Wikipedia']")));
    }

    @Then("User close the browser")
    public void userCloseTheBrowser() {
        closeWebDriver();
    }
}
