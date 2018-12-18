package Project.stepdef;

import Project.driverclass;
import Project.pageobjectfiles.d3ditembuy_pagefile;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class d3ditembuy_stepdef extends driverclass {

    public d3ditembuy_pagefile item_buy= PageFactory.initElements(driver, d3ditembuy_pagefile.class);

    @And("^I click on Products$")
    public void iClickOnProducts() {

        item_buy.method1();
    }

    @And("^I click on security alarm system$")
    public void iClickOnSecurityAlarmSystem() {
        item_buy.method2();
    }



    @And("^I should see item added to cart$")
    public void iShouldSeeItemAddedToCart(String expectedheader_results1) {
        item_buy.HeaderTextAssertions1(expectedheader_results1);

    }

    @When("^I click on  cart$")
    public void iClickOnCart() {
        item_buy.method5();
    }

    @And("^click on proceed to checkout$")
    public void clickOnProceedToCheckout() {
        item_buy.method6();
    }

    @And("^enter billing details from \"([^\"]*)\"$")
    public void enterBelowBillingDetailsFrom(String propertyFile) throws IOException {
        item_buy.readPropertyfiles(propertyFile);
        item_buy.enterDetails();

    }

    @And("^I click on proceed to paypal$")
    public void iClickOnProceedToPaypal() {

        item_buy.method7();
    }

    @Then("^I should see paypal checkoutheader page$")
    public void iShouldSeePaypalCheckoutheaderPage(String expectedheader_results2) {
        item_buy.HeaderTextAssertions2(expectedheader_results2);
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() throws Throwable {
        item_buy.method4();

    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String abc) throws Throwable {
        item_buy.method3();

    }
}
