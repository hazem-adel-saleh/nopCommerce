package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;
public class P05_hoverCategs {

    public WebElement hoverOnCateg() {
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));

    }

    public List<WebElement> selectSub() {
        String locator = "ul[class=\"top-menu notmobile\"]  a[href=\"/computers\"]+div[class=\"sublist-toggle\"]+ul[class=\"sublist first-level\"] a[href]";
        return driver.findElements(By.cssSelector(locator));
    }

    public String confirmSubcategory() {
        return driver.getCurrentUrl();

    }
}