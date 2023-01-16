package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_homeSlider;
import org.testng.asserts.SoftAssert;

public class D06_homeSlider {
    P06_homeSlider homeSlider = new P06_homeSlider();

    @When("user click on iphone photo will be directed to page of the product")
    public void clickProduct() {
        homeSlider.hoveriphone().click();

    }


    @When("user click on samsung photo will be directed to page of the product")
    public void userClickOnSamsungPhotoWillBeDirectedToPageOfTheProduct() {
        homeSlider.hoversamsung().click();
    }

    @Then("confirm that user directed to product page {string}")
    public void confirmThatUserDirectedToProductPage(String arg0) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(homeSlider.confirmUrl().contains(arg0));

        soft.assertAll();
    }

}
