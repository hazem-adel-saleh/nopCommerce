package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;
public class P04_search {

    public List<WebElement> search() {
        List<WebElement> element = new ArrayList<>(2);
        element.add(0,driver.findElement(By.id("small-searchterms")));
        element.add(1,driver.findElement(By.className("search-box-button")));
        return element;
    }

    public List<WebElement> productNameAppear() {
        return driver.findElements(By.className("product-title"));

    }
    public String productSKUAppear() {
        driver.findElement(By.cssSelector("a[href=\"/asus-n551jk-xo076h-laptop\"]")).click();
        return driver.findElement(By.id("sku-5")).getText();

    }

    public boolean checkCurrentUrl() {
        return driver.getCurrentUrl().contains("/search?q");
    }

}
