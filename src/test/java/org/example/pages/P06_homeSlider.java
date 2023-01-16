package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;
public class P06_homeSlider {

    public WebElement hoveriphone() {
        String locator = "a[class=\"nivo-imageLink\"] img[src=\"https://demo.nopcommerce.com/images/thumbs/0000088_banner_01.webp\"]";
        return driver.findElement(By.cssSelector(locator));
    }

    public WebElement hoversamsung() {
        String locator = "a[class=\"nivo-imageLink\"] img[src=\"https://demo.nopcommerce.com/images/thumbs/0000089_banner_02.webp\"]";
        return driver.findElement(By.cssSelector(locator));
    }

    public String  confirmUrl() {
        return driver.getCurrentUrl();
    }
}
