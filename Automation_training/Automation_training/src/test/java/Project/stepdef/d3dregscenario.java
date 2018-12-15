package Project.stepdef;

import Project.driverclass;
import Project.pageobjectfiles.d3dregpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class d3dregscenario extends driverclass {

    public d3dregpage get = PageFactory.initElements(driver, d3dregpage.class);


//    @Given("^I enter url as \"([^\"]*)\"$")
//    public void iEnterUrlAs(String url) {
//        driver.get(url);
//        driver.manage().window().maximize();
//    }

    @When("^I click on the Register button$")
    public void iClickOnTheRegisterButton() {
        get.method1();
    }

    @Given("^I entered First name as \"([^\"]*)\"$")
    public void iEnteredFirstNameAs(String firstname) {
        get.method2(firstname);
    }

    @Given("^I entered Last name as \"([^\"]*)\"$")
    public void iEnteredLastNameAs(String lastname) {
        get.method3(lastname);
    }

    @Given("^I entered email as \"([^\"]*)\"$")
    public void iEnteredEmailAs(String emailid) {
        get.method4(emailid);

    }

    @And("^I entered New password  as \"([^\"]*)\"$")
    public void iEnteredNewPasswordAs(String password) {
        get.method5(password);

    }

    @And("^I entered confirm password as \"([^\"]*)\"$")
    public void iEnteredConfirmPasswordAs(String npassword) {
        get.method6(npassword);
    }


    @When("^I click the Register button$")
    public void iClickTheRegisterButton() {
        get.method7();
    }


    @Then("^I should see confirmation email.$")//The character '\' is a special character and needs to be escaped when used as part of a String
    public void iShouldSeeConfirmationEmail(String expectedHeader_results) {

        get.HeaderTextAssertions(expectedHeader_results);
    }
}
