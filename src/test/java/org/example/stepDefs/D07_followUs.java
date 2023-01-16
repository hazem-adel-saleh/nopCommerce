package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followUs;

import org.testng.Assert;


public class D07_followUs {
    P07_followUs follow = new P07_followUs();

    @When("user click on facebook icon")
    public void userClickFbIcon() {
        follow.clickFb().click();
    }

    @Then("user redirected to facebook page {string}")
    public void userRedirectedToFacebookPage(String arg) {
        Assert.assertTrue(follow.confirmtab().contains(arg));
    }

    @When("user click on twitter icon")
    public void userClickOnTwitterIcon() {
        follow.clickTwitter().click();
    }

    @Then("user redirected to twitter page {string}")
    public void userRedirectedToTwitterPage(String arg) {
        Assert.assertTrue(follow.confirmtab().contains(arg));
    }

    @When("user click on RSS icon")
    public void userClickOnRSSIcon() {
        follow.clickRSS().click();
    }

    @Then("user redirected to RSS page {string}")
    public void userRedirectedToRSSPage(String arg) {
        Assert.assertTrue(follow.confirmtab().contains(arg));
    }

    @When("user click on youtube icon")
    public void userClickOnYoutubeIcon() {
        follow.clickYt().click();
    }

    @Then("user redirected to youtube page {string}")
    public void userRedirectedToYoutubePage(String arg) {
        Assert.assertTrue(follow.confirmtab().contains(arg));
    }
}
