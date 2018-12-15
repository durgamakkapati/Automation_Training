package Project.pageobjectfiles;

import Project.driverclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class d3dregpageoutline extends driverclass {

  public d3dregpageoutline reg_page1= PageFactory.initElements (driver, d3dregpageoutline.class);
    @FindBy(name = "first_name")
    private WebElement firstName_Ele;

    @FindBy(name = "last_name")
    private WebElement last_Ele;

    @FindBy(name = "email")
    private WebElement email_Ele;

    @FindBy(name = "pass1")
    private WebElement pass1_ele;

    @FindBy(name = "pass2")
    private WebElement pass2_ele;

    @FindBy(name = "btn-submit")
    private WebElement RegisterButton;

    private WebDriverWait wait = new WebDriverWait(driver, 10);


    public void enterFirstName(String firstname) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.name("first_name"))));
        firstName_Ele.sendKeys(firstname);
    }

    public void enterLastName(String lasttname) {
        driver.findElement(By.name("last_name")).sendKeys(lasttname);
        //last_Ele.sendKeys(lasttname);


    }

    public void emailid(String emailid) {
        email_Ele.sendKeys(emailid);

    }

    public void Newpassword(String password) {
        pass1_ele.sendKeys(password);

    }

    public void confirmpassword(String confirmpassword) {
        pass2_ele.sendKeys(confirmpassword);

    }

    public void clickRegisterButton() {
        RegisterButton.click();
    }

    public void HeaderTextAssertions1(String expectedHeader_results) {

        String actualHeader_Results = null;
        System.out.println(expectedHeader_results);

        actualHeader_Results = driver.findElement(By.cssSelector(".cleanlogin-notification.error>p")).getText();
        System.out.println(actualHeader_Results);

       // Assert.assertEquals(expectedHeader_results, actualHeader_Results);
    }

    public void HeaderTextAssertions2(String expectedHeader_results) {
        String actualHeader_Results = null;
        System.out.println(expectedHeader_results);

        actualHeader_Results = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        System.out.println(actualHeader_Results);

        Assert.assertEquals(expectedHeader_results, actualHeader_Results);
    }

    public void HeaderTextAssertions3(String expectedHeader_results) {
        String actualHeader_Results = null;
        System.out.println(expectedHeader_results);

        actualHeader_Results = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        System.out.println(actualHeader_Results);

        Assert.assertEquals(expectedHeader_results, actualHeader_Results);
    }

    public void HeaderTextAssertion4(String expectedHeader_results) {
        String actualHeader_Results = null;
        System.out.println(expectedHeader_results);
        actualHeader_Results = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        System.out.println(actualHeader_Results);
        Assert.assertEquals(expectedHeader_results, actualHeader_Results);
    }

    public void HeaderTextAssertions5(String expectedheader_results) {
        String actualHeader_results = null;
        System.out.println(expectedheader_results);
        actualHeader_results = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        System.out.println(actualHeader_results);
        Assert.assertEquals(expectedheader_results, actualHeader_results);
    }
}


