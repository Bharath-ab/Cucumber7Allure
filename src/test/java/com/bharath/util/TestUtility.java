package com.bharath.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestUtility {
    public WebDriver driver;

    public WebDriver launchWebDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/drivers/msedgedriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
        } else {
            System.out.println("Available browsers are Chrome & Edge");
        }
        return driver;
    }

    public void closeWebDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }

    }

}
