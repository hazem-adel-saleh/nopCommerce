package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;
public class P07_followUs {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public WebElement clickFb() {
        return driver.findElement(By.cssSelector("div[class=\"social\"] li[class=\"facebook\"]"));
    }

    public WebElement clickTwitter() {
        return driver.findElement(By.cssSelector("div[class=\"social\"] li[class=\"twitter\"]"));
    }

    public WebElement clickRSS() {
        return driver.findElement(By.cssSelector("div[class=\"social\"] li[class=\"rss\"]"));
    }

    public WebElement clickYt() {
        return driver.findElement(By.cssSelector("div[class=\"social\"] li[class=\"youtube\"]"));
    }

    public String confirmtab() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //get windows list
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //switch to fb tab
        driver.switchTo().window(tabs.get(1));

        return driver.getCurrentUrl();
    }

}
