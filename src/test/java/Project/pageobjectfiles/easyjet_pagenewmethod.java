package Project.pageobjectfiles;


import Project.driverclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class easyjet_pagenewmethod extends driverclass {
    @FindBy(xpath="//span[@class='sign-in']")
    private WebElement signin_Ele;

    @FindBy(xpath=".//*[@id='drawer-dialog']/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/a")
    private WebElement register_Ele;

    @FindBy(name = "EmailAddress")
    private WebElement emailAddress_Ele;

    @FindBy(id = "EmailAddressCheck")
    private WebElement confirmEmailAddress_Ele;

    @FindBy(name="pass1")
    private WebElement password_Ele;

    @FindBy(name="pass2")
    private WebElement npassword_Ele;

    @FindBy(xpath="//option[@value='2']")
    private WebElement title_Ele;

    @FindBy(name="Firstname")
    private WebElement firstname_Ele;

    @FindBy(name="Lastname")
    private WebElement surname_Ele;

    @FindBy(name="Address1")
    private WebElement address_Ele;

    @FindBy(name="City")
     private WebElement city_Ele;

    @FindBy(name="PostalCode")
    private WebElement postcode_Ele;

    @FindBy(xpath="//option[@value='GBR']")
    private WebElement country_Ele;

    @FindBy(id="\"CountryMobileCodes\"")
    private WebElement phonenum_Ele;

    @FindBy(id="\"btnRegister\"")
    private WebElement register_Ele1;

    public void method1() {

        signin_Ele.click();
    }

    public void method2() {
        register_Ele.click();
    }

        public void method3(String emailid){

        emailAddress_Ele.sendKeys(emailid);


    }

    public void method4(String nemailid) {
        confirmEmailAddress_Ele.sendKeys(nemailid);

    }
    public void method5(String password) {
        password_Ele.sendKeys(password);

    }
    public void method6(String npassword) {
        npassword_Ele.sendKeys(npassword);

    }
    public void method7(String title) {
            String titleIndex = " ";
            if (title.equalsIgnoreCase("Mr")) {
                titleIndex = "1";
            } else if (title.equalsIgnoreCase("Mrs")) {
                titleIndex = "2";
            } else if (title.equalsIgnoreCase("Ms")) {
                titleIndex = "3";
            }

        }
    public void method8(String firstname) {
        firstname_Ele.sendKeys(firstname);

    }
    public void method9(String surname) {
        surname_Ele.sendKeys(surname);

    }
    public void method10(String address) {
        address_Ele.sendKeys(address);

    }


     public void method11(String city)  {
         city_Ele.sendKeys(city);


    }
    public void method12(String postcode) {
        postcode_Ele.sendKeys(postcode);

    }
    public void method13(String country) {
        country_Ele.sendKeys(country);

    }
    public void method14(String phonenum) {

        phonenum_Ele.sendKeys(phonenum);


        //phonenum_Ele.sendKeys(Integer.toString(Integer.parseInt(phonenum))); tocheck?

    }
    public void method15() {
        register_Ele.click();

    }

    public void HeaderTextAssertions(String expectedHeader_Results) {

                String actualHeader_Results = null;
                System.out.println(expectedHeader_Results);

                actualHeader_Results = driver.findElement(By.cssSelector(".MemberPart>h2")).getText();
                System.out.println(actualHeader_Results);

                assertEquals(expectedHeader_Results,actualHeader_Results);
                //assertNotEquals(expectedHeader_Results,actualHeader_Results);
               // assertTrue(actualHeader_Results.contains("easyJet.com"));


            }
        }








