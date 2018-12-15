package Project.stepdef;

import Project.driverclass;
import Project.pageobjectfiles.easyjet_pagenewmethod;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

//import pageobject.easyjet_pagenewmethod; we have deleted this file as its not been shown under the project directory


public class easyjet_stepdefoldmethod extends driverclass {


    public easyjet_pagenewmethod get = PageFactory.initElements(driver, easyjet_pagenewmethod.class);

//    @Given("^I enter url as \"([^\"]*)\"$")
//    public void iEnterUrlAs(String url) {
//
//        driver.get(url);
//        driver.manage().window().maximize();
//    }

    @When("^I click on Sign in button$")
    public void iClickOnSignInButton() {
        get.method1();
    }

    @When("^I click Register here button$")
    public void iClickRegisterHereButton() throws InterruptedException {
        get.method2();

    }

    @Given("^I enter email ID as \"([^\"]*)\"$")
    public void iEnterEmailIDAs(String emailid) throws InterruptedException {
        get.method3(emailid);
    }

    @Given("^I enter confirming email ID as \"([^\"]*)\"$")
    public void iEnterConfirmingEmailIDAs(String nemailid) {

        get.method4(nemailid);
    }

    @Given("^I enter password as\"password$")
    public void iEnterPasswordAsPassword(String password) {
        get.method5(password);

    }

    @Given("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String npassword) {
        get.method6( npassword);
    }

    @Given("^I select title from dropdown menu \"([^\"]*)\"$")
    public void iSelectTitleFromDropdownMenu(String title) {
        get.method7(title);
    }

    @Given("^I enter first name as\"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstname) {
        get.method8(firstname);

    }

    @Given("^I enter surname as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String surname) {
       get.method9(surname);

    }

    @Given("^I enter address as \"([^\"]*)\"$")
    public void iEnterAddressAs(String address) {
        get.method10(address);
    }

    @Given("^I enter town/city as \"([^\"]*)\"$")
    public void iEnterTownCityAs(String town) {
        get.method11(town);

    }

    @Given("^I enter postcode as \"([^\"]*)\"$")
    public void iEnterPostcodeAs(String postcode) {
        get.method12(postcode);

    }

    @Given("^I click country from dropdown menu as \"([^\"]*)\"$")
    public void iClickCountryFromDropdownMenuAs(String country) {
        get.method13(country);
    }

    @Given("^I enter phone number as \"([^\"]*)\"$")
    public void iEnterPhoneNumberAs(String phonenum) {
        get.method14(phonenum);//need to check ?

        }

    @When("^I click Register Now button$")
    public void iClickRegisterNowButton() {
        get.method15();

    }

    @Then("^I should see header as \"([^\"]*)\"$")
    public void iShouldSeeHeaderAs(String expectedHeader_results){

     get.HeaderTextAssertions(expectedHeader_results);


    }
}
