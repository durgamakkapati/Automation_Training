package Project.stepdef;

import Project.driverclass;
import Project.pageobjectfiles.d3d_getaquote_pageobjfile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class d3d_getaquote_stepdef extends driverclass {

    public d3d_getaquote_pageobjfile get= PageFactory.initElements(driver, d3d_getaquote_pageobjfile.class);


    @Given("^I entered url \"([^\"]*)\"$")
    public void i_entered_url(String url) {

       // driver.get(url);
       // driver.manage().window().maximize();


    }

    @When("^I click on Online Demo$")
    public void iClickOnOnlineDemo() throws InterruptedException {
        get.method1();
    }

    @Given("^I entered first name as \"([^\"]*)\"$")
    public void iEnteredFirstNameAs(String firstname) {
        get.method2(firstname);

    }

    @And("^I entered last name as \"([^\"]*)\"$")
    public void iEnteredLastNameAs(String lastname){
        get.method3(lastname);

    }

//    @And("^I entered email as \"([^\"]*)\"$")
//    public void iEnteredEmailAs(String email) {
//        get.method4(email);
//    }

    @And("^I entered phone number as \"([^\"]*)\"$")
    public void iEnteredPhoneNumberAs(String phonenum) {
        get.method5(phonenum);
    }

    @And("^I entered subject as \"([^\"]*)\"$")
    public void iEnteredSubjectAs(String subject) {
        get.method6(subject);
    }

    @And("^I entered message as \"([^\"]*)\"$")
    public void iEnteredMessageAs(String message) {
        get.method7(message);
    }

    @And("^I entered the Captcha Code$")
    public void iEnteredTheCaptchaCode(String captchacode) {
        get.method8(captchacode);
    }

    @When("^I click on button Send message$")
    public void iClickOnButtonSendMessage() {
        get.method9();
    }

    @Then("^I should see email notification$")
    public void iShouldSeeEmailNotification(String expected_result) {
        get.emailnotificationAssertions(expected_result);

    }
}
