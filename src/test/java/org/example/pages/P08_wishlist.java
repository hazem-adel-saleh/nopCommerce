package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.example.stepDefs.Hooks.driver;

public class P08_wishlist {

    public List<WebElement> clickWish() {
        return driver.findElements(By.className("add-to-wishlist-button"));
    }

    public String confirmUrl() {
        return driver.getCurrentUrl();
    }
    public WebElement confirmBar() {
        return  driver.findElement(By.className("bar-notification"));
    }
    public WebElement confirmIcon() {
        return driver.findElement(By.cssSelector("div[id=\"bar-notification\"] a[href=\"/wishlist\"]"));
    }
    public WebElement confirmWish() {
        return driver.findElement(By.cssSelector("div[id=\"bar-notification\"] p[class=\"content\"]"));
    }
}
