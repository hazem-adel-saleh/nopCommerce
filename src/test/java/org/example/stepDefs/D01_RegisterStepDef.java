package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {
    P01_Register reg = new P01_Register();

    @Given("user get to registration page")
    public void homeRegisterBtn() {
        //click on register button
        reg.homeRegisterBtn().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        //select gender
        reg.selectGender().click();
    }

    @And("user add first name {string} and last name {string}")
    public void userAddFirstNameAndLastName(String arg0, String arg1) {
        //enter first name
        reg.firstName().sendKeys(arg0);
        //enter last name
        reg.lastName().sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        //you can use random values by int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        //using static dropdown, create obj from Select and assign the webElement of day of bith
        Select select = new Select(reg.dayList());
        select.selectByValue("23");
        //using select to choose month
        select = new Select(reg.monthList());
        select.selectByValue("7");
        //using select to choose year
        select = new Select(reg.yearList());
        select.selectByValue("1994");
    }

    @And("user enter new valid email address {string}")
    public void userEnterNewEmailAddress(String arg0) {
        //user enter new valid email address
        reg.enterMail().sendKeys(arg0);
    }

    @And("user enter valid password {string} and confirm it {string}")
    public void userEnterValidPasswordAndConfirmIt(String arg0, String arg1) {
        //user enter new password
        reg.enterPass().sendKeys(arg0);
        //user confirm the password
        reg.confirmPass().sendKeys(arg1);
    }

    @And("user click on REGISTER button")
    public void userClickOnREGISTERButton() {
        //click on REGISTER button
        reg.registrationBtn().click();
    }

    @Then("Assert that success message displayed")
    public void assertThatSuccessMessageDisplayed() {
        SoftAssert soft = new SoftAssert();

        //Assert that success msg is displayed
        soft.assertTrue(reg.successMsg().isDisplayed());
        //Assert that success msg is displayed in green
        String color = reg.successMsg().getCssValue("color");
        soft.assertEquals(Color.fromString(color).asHex(),"#4cb17c");

        soft.assertAll();
    }
}
