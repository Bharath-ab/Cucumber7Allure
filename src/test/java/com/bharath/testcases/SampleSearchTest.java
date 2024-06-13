package com.bharath.testcases;

import com.bharath.util.TestUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SampleSearchTest extends TestUtility {
    WebDriver driver;
    WebDriverWait wait;
    String url = "https://www.google.com/";
    String searchText = "Cat";
    String browser = "chrome";

    @BeforeEach
    @DisplayName("Create Browser Session")
    public void setupWebDriver() {
        driver = launchWebDriver(browser);
    }

    @Test()
    @DisplayName("Simple google search project")
    public void googleSearch() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.navigate().to(url);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@title='Search']"))).sendKeys(searchText);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@title='Search']"))).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Cat - Wikipedia']")));
    }

    @AfterEach()
    @DisplayName("Close Browser Session")
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
