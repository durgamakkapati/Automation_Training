package Project.stepdef;

import Project.driverclass;
import Project.pageobjectfiles.d3dregpageoutline;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class d3dregscenariooutline extends driverclass {
    public d3dregpageoutline reg_page1 = PageFactory.initElements(driver, d3dregpageoutline.class);


    @Given("^I enter First name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String Firstname) throws InterruptedException {
//        driver.findEleme/**/nt(By.xpath("dd")).sendKeys(Firstname);
        reg_page1.enterFirstName(Firstname);
        }

        @Given("^I enter Last name as \"([^\"]*)\"$")
        public void iEnterLastNameAs (String lastname){
            reg_page1.enterLastName(lastname);
        }

        @Given("^I enter email as \"([^\"]*)\"$")
        public void iEnterEmailAs (String email){
            reg_page1.emailid(email);
        }

        @And("^I enter New password  as \"([^\"]*)\"$")
        public void iEnterNewPasswordAs (String password){
            reg_page1.password(password);

        }

    @And("^I enter confirm password as \"([^\"]*)\"$")
   public void iEnterConfirmPasswordAs(String confirmpassword) {
        reg_page1.confirmpassword(confirmpassword);
   }

        @When("^I click Register button$")
        public void iClickRegisterButton () {
            reg_page1.clickRegisterButton();
        }


        @Then("^I should see Error message as \"([^\"]*)\" for \"([^\"]*)\"$")
        public void iShouldSeeErrorMessageAsFor (String expectedheader_results, String Scenario){

            if (Scenario.equalsIgnoreCase("SC1")) {

                reg_page1.HeaderTextAssertions1(expectedheader_results);
            }
             else if (Scenario.equalsIgnoreCase("SC2")) {
                reg_page1.HeaderTextAssertions2(expectedheader_results);
            }
             else if (Scenario.equalsIgnoreCase("SC3")) {

                reg_page1.HeaderTextAssertions3(expectedheader_results);
            }
            else if (Scenario.equalsIgnoreCase("SC4")) {

                reg_page1.HeaderTextAssertion4(expectedheader_results);

            }

            else if (Scenario.equalsIgnoreCase("SC5")) {
                reg_page1.HeaderTextAssertions5(expectedheader_results);
            }
        }
    }



