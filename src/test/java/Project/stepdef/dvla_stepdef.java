package Project.stepdef;

import Project.driverclass;
import Project.pageobjectfiles.dvla_page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Scenario;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class dvla_stepdef extends driverclass {

    public dvla_page dvlaPage = PageFactory.initElements(driver, dvla_page.class);
//    @Given("^I enter url as \"([^\"]*)\"$")
//    public void iEnterUrlAs(String url) {
//    }

    @And("^i click on startnow$")
    public void iClickOnStartnow() {
    }

    @And("^i read the registration_num from excel \"([^\"]*)\" at directory \"([^\"]*)\"$")
    public void iReadTheRegistration_numFromExcelAtDirectory(String filename, String directory) throws IOException {

        dvlaPage.readexcel(filename,directory);
    }



    @And("^i enter the registration_num$")
    public void iEnterTheRegistration_num() {
        dvlaPage.method3();

    }

    @When("^i click continue$")
    public void iClickContinue() {
    }

    @Then("^i should see \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldSeeAnd(String Make, String Colour) {



    }


}
