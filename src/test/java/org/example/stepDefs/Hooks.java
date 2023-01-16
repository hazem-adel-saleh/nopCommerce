package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser() {
        //1- Define driver
        WebDriverManager.edgedriver().setup();

        //2- create new object from browserdriver
        driver = new EdgeDriver();

        //3- configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //4- navigate
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
