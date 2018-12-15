package Project.pageobjectfiles;


import Project.driverclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class easyjet_pageoldmethod extends driverclass {


    @FindBy(name = "EmailAddress")
    private WebElement emailAddress;

    @FindBy(id = "EmailAddressCheck")
    private WebElement cofirmEmailAddress;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement Title;

    private WebDriverWait wait = new WebDriverWait(driver, 10);//explicitwait


    public void method1() {

        driver.findElement(By.xpath("//span[@class='sign-in']")).click();
    }

    public void method2() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='drawer-dialog']/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/a")).click();
    }

    public void method3(String emailid) throws InterruptedException {
        //Thread.sleep(3000);

        // wait(3000);

        //Implicit wait
        // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //Explicit wait
        wait.until(ExpectedConditions.visibilityOf(emailAddress));


        emailAddress.sendKeys(emailid);
        //driver.findElement(By.name("EmailAddress")).sendKeys(emailid);
    }

    public void method4(String nemailid) {
        cofirmEmailAddress.sendKeys(nemailid);
        // driver.findElement(By.id("EmailAddressCheck")).sendKeys(nemailid);
    }

    public void method5(String password) {
        driver.findElement(By.name("Password")).sendKeys(password);

    }

    public void method6(String npassword) {

        driver.findElement(By.name("Password")).sendKeys(npassword);
    }

    public void method7(String title) {
        String titleIndex = "";

        if (title.equalsIgnoreCase("MRS")) {
            titleIndex = "2";

        } else if (title.equalsIgnoreCase("MR")) {
            titleIndex = "1";
        }


        new Select(Title).selectByValue(titleIndex);
        // new Select(Title).selectByIndex(1);
        //driver.findElement(By.xpath("//option[@value='2']")).sendKeys(title);

    }

    public void method8(String firstname) {
        driver.findElement(By.name("FirstName")).sendKeys(firstname);

    }

    public void method9(String surname) {
        driver.findElement(By.name("LastName")).sendKeys(surname);

    }

    public void method10(String address) {

        driver.findElement(By.name("Address1")).sendKeys(address);
    }

    public void method11(String town) {

        driver.findElement(By.name("City")).sendKeys(town);
    }

    public void method12(String postcode)
    {
        driver.findElement(By.name("PostalCode")).sendKeys(postcode);
    }

    public void method13(String country) {

        driver.findElement(By.xpath("//option[@value='GBR']")).sendKeys(country);
    }

    public void method14(int phonenum) {
        driver.findElement(By.id("CountryMobileCodes")).sendKeys(Integer.toString(phonenum));
    }

    public void method15() {
        driver.findElement(By.id("btnRegister")).click();

    }

    public void HeaderTextAssertions(String expectedHeader_Results) {

        String actualHeader_Results = null;
        System.out.println(expectedHeader_Results);

        actualHeader_Results = driver.findElement(By.cssSelector(".MemberPart>h2")).getText();
        System.out.println(actualHeader_Results);

        assertEquals(expectedHeader_Results,actualHeader_Results);
        //assertNotEquals(expectedHeader_Results,actualHeader_Results);
        assertTrue(actualHeader_Results.contains("easyJet.com"));
    }
}
