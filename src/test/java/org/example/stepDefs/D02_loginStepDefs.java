package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDefs {
    P02_login log = new P02_login();

    @Given("user go to login page")
    public void userLogin() {
        log.login().click();

    }

    @When("user enter his email {string} and his password {string}")
    public void userEnterHisEmailAndHisPassword(String arg0, String arg1) {
        log.enterMail().sendKeys(arg0);
        log.enterPass().sendKeys(arg1);

    }

    @And("user click on LOG IN button")
    public void userClickOnLOGINButton() {
        log.loginBtn().click();

    }

    //Assert valid credentials and successful login
    @Then("user redirected to home page and Log out button is displayed")
    public void userRedirectedToHomePageAndLogOutButtonIsDisplayed() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(log.loginSuccessfully().isDisplayed());
        soft.assertEquals(log.loginHomeUrl(),"https://demo.nopcommerce.com/");


        soft.assertAll();
    }

    //Assert invalid credentials and failed to login
    @Then("failed message displayed with red background")
    public void messageDisplayedWithRedBackground() {
        SoftAssert soft = new SoftAssert();
        //assert that the user still in login page
        soft.assertTrue(log.failLogin().contains("nopcommerce.com/login"));
        //confirm the failure message
        soft.assertTrue(log.failedLogin().isDisplayed());
        String color = log.failedLogin().getCssValue("color");
        soft.assertEquals(Color.fromString(color).asHex(), "#e4434b");

        soft.assertAll();
    }
}
