package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement homeRegisterBtn() {
        return driver.findElement(By.className("ico-register"));

    }
    public WebElement selectGender() {
        return driver.findElement(By.id("gender-male"));

    }
    public WebElement firstName() {
        return driver.findElement(By.id("FirstName"));

    }
    public WebElement lastName() {
        return driver.findElement(By.id("LastName"));

    }
    public WebElement dayList() {
        return driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement monthList() {
        return driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement yearList() {
        return driver.findElement(By.name("DateOfBirthYear"));

    }
    public WebElement enterMail() {
        return driver.findElement(By.id("Email"));

    }
    public WebElement enterPass() {
        return driver.findElement(By.id("Password"));

    }
    public WebElement confirmPass() {
        return driver.findElement(By.id("ConfirmPassword"));

    }
    public WebElement registrationBtn() {
        return driver.findElement(By.id("register-button"));

    }
    public WebElement successMsg() {
        return driver.findElement(By.className("result"));
    }
}
