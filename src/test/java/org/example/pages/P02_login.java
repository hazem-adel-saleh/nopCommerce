package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;
public class P02_login {

    public WebElement login() {
        return driver.findElement(By.className("ico-login"));

    }

    public WebElement enterMail() {
        return driver.findElement(By.id("Email"));

    }

    public WebElement enterPass() {
        return driver.findElement(By.id("Password"));

    }

    public WebElement loginBtn() {
        return driver.findElement(By.className("login-button"));

    }

    //Assert valid credentials and successful login
    public WebElement loginSuccessfully() {
        return driver.findElement(By.className("ico-logout"));
    }

    public String loginHomeUrl() {
        return driver.getCurrentUrl();
    }

    //Assert invalid credentials and failed to login
    public String failLogin() {
        return driver.getCurrentUrl();

    }

    public WebElement failedLogin() {
        return driver.findElement(By.className("message-error"));

    }


}
