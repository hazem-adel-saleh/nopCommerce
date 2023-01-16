package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_currencies;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D03_currencies {
    P03_currencies currency = new P03_currencies();

    @When("user choose the currency {string}")
    public void userChooseTheCurrencyHeWantEuro(String euro) {
        //confirm currency has been changed on all products
        Select select = new Select(currency.selectCurrency());
        select.selectByVisibleText(euro);
    }

    @Then("confirm the selected currency")
    public void confirm() {
        SoftAssert soft = new SoftAssert();

        //confirm currency has been changed on all products
        for (int i = 0; i < currency.confirm().size(); i++) {
            String actualResult = currency.confirm().get(i).getText();
            soft.assertTrue(actualResult.contains("€"));
        }

        soft.assertAll();
    }
}
