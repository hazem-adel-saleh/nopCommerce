package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverCategs;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategs {
    P05_hoverCategs cat = new P05_hoverCategs();

    @When("user hover on category")
    public void userHoverOnCateg() {
        Actions hover = new Actions(driver);
        hover.moveToElement(cat.hoverOnCateg()).perform();

    }

    @And("user select subcategory")
    public void userSelectSubcateg() {
        cat.selectSub().get(1).click();

    }

    @Then("confirm the subcategory is selected")
    public void confirmTheSubcategoryIsSelected() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(cat.confirmSubcategory().contains("nopcommerce.com/notebooks"));

        soft.assertAll();
    }
}
