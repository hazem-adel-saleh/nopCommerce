package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D04_search {
    P04_search srch = new P04_search();

    @When("user enter the product's name {string} in the field of search")
    public void userEnterProductNameInSearch(String arg) {
        //search for product by name
        srch.search().get(0).sendKeys(arg);
        //click on search button
        srch.search().get(1).click();
    }

    @Then("user redirected to search page with name result of his searching appears")
    public void userRedirectedToSearchPageWithNameResultOfHisSearchingAppears() {
        SoftAssert soft = new SoftAssert();
        //assert url
        soft.assertTrue(srch.checkCurrentUrl());
        //assert products
        int Size = srch.productNameAppear().size();
        for (int i = 0; i < Size; i++) {
            WebElement productName = srch.productNameAppear().get(i);
            soft.assertTrue(productName.getText().contains("HTC"));
        }

        soft.assertAll();
    }

    @When("user enter the product's sku {string} in the field of search")
    public void userEnterTheProductSSkuInTheFieldOfSearch(String arg) {
        //search for product by sku
        srch.search().get(0).sendKeys(arg);
        //click on search button
        srch.search().get(1).click();
    }

    @Then("user redirected to search page with sku {string} result of his searching appears")
    public void userRedirectedToSearchPageWithSKUResultOfHisSearchingAppears(String arg) {
        SoftAssert soft = new SoftAssert();
        //assert url
        soft.assertTrue(srch.checkCurrentUrl());
        //assert product
        soft.assertTrue(srch.productSKUAppear().contains(arg));

        soft.assertAll();
    }


}
