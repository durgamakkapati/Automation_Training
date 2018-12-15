package Project.pageobjectfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class d3d_getaquote_pageobjfile {

    @FindBy(xpath=".//*[@id='masthead']/div[1]/div[2]/div/aside/div/ul/li[3]/div/div/a")
    private WebElement demo_Ele;

    @FindBy(name="first-name")
    private WebElement fn_Ele;

   @FindBy(name="last-name")
    private WebElement ln_Ele;

   @FindBy(name="your-email")
    private WebElement Email_Ele;

   @FindBy(name="tel-879")
    private WebElement phonenum_Ele;

 @FindBy(name="your-subject")
    private WebElement sub_Ele;

@FindBy(name="your-message")
private WebElement msg_Ele;

@FindBy(name="captcha-005")
private WebElement captcha_Ele;

@FindBy(xpath=".//*[@id='wpcf7-f391-p1521-o1']/form/p[4]/input")
private WebElement msgbutton_Ele;

@FindBy(xpath=".//*[@id='post-4029']/h1")
private WebElement header_Ele;


//private WebDriverWait Wait=new WebDriverWait(driver,10);

public void method1() throws InterruptedException {

    Thread.sleep(10);
    //Wait.until(ExpectedConditions.visibilityOf());
    demo_Ele.click();

        }

        public void method2(String firstname)
        { fn_Ele.sendKeys(firstname);
        }

public void method3(String lastname)
{
        ln_Ele.sendKeys(lastname);
}

public void method4(String email)
{
    Email_Ele.sendKeys(email);
}

public void method5(String phonenum)
{
        phonenum_Ele.sendKeys(phonenum);

        }

public void method6(String subject){

    sub_Ele.sendKeys(subject);
}

public void method7(String message){
    msg_Ele.sendKeys(message);
    }


public void method8(String captcha){
    captcha_Ele.sendKeys(captcha);
}

public void method9(){
    msgbutton_Ele.click();
}




public void emailnotificationAssertions(String expected_result){
    System.out.println(expected_result);

    String actual_result=null;
    actual_result= header_Ele.getText();

    assertEquals(actual_result,expected_result);
}

}