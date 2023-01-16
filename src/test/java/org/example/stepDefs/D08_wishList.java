package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_wishlist;
import org.testng.asserts.SoftAssert;

public class D08_wishList {
    P08_wishlist wish = new P08_wishlist();

    @When("user click on product's wish {int}")
    public void userClickOnProductWish(int arg) {
        wish.clickWish().get(arg).click();
    }

    @Then("the product added to wishlist")
    public void theProductAddedToWishlist() {
        SoftAssert soft = new SoftAssert();

        /*assert user stayed on the same page*/
        soft.assertTrue(wish.confirmUrl().contentEquals("https://demo.nopcommerce.com/"));
        /*assert bar is displayed*/
        soft.assertTrue(wish.confirmBar().isDisplayed());
        /*assert the bar color is green*/
        soft.assertTrue(wish.confirmBar().getCssValue("background-color").contains("rgba(75, 176, 122, 1)"));
        /*assert the content of the bar The product has been added to your wishlist*/
        soft.assertTrue(wish.confirmWish().getText().contains("The product has been added to your"));
        /*assert the new temp. icon of wishlist is displayed so user can easily go to wishlist page*/
        soft.assertTrue(wish.confirmIcon().isDisplayed());

        soft.assertAll();
    }
}