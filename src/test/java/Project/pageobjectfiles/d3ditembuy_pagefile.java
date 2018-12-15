package Project.pageobjectfiles;

import Project.driverclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
public class d3ditembuy_pagefile extends driverclass {


    String firstname;
    String lastname;
    String email;
    String phone;
    String country;
    String Address;
    String city;
    String postcode;


    @FindBy(xpath =".//*[@id='menu-item-1725']/a")
    private WebElement product_Ele;


    @FindBy(css = ".//*[@id='wpc_5c12cd4aa67f7']/div/div/div[2]/div/div[1]/div/a/div/img")

    private WebElement image_Ele;


    @FindBy(xpath = ".//*[@id='wpc_5c0e4978b1680']/div/div/div[2]/div/div/div/p[1]/em/strong/a")

        private WebElement link_Ele;


    @FindBy(xpath = ".//*[@id='wpc_5c0e49bde56d7']/div/div/div[2]/div/div/div/div/form/button")

        private WebElement cart_Ele;


    @FindBy(xpath = ".//*[@id='wpmenucartli']/a")

    private WebElement addcart_Ele;


     @FindBy(xpath = ".//*[@id='wpc_5c0e4a9c3cd65']/div/div/div/div/div/div/div/strong/div/div/div/a\n")
        private WebElement chkout_Ele;


     @FindBy(xpath = ".//*[@id='post-2385']/h1")

        private WebElement billingheader_Ele;


     @FindBy(xpath = ".//*[@id='payment']/div")
        private WebElement pp_Ele;

   // private WebDriverWait Wait=new WebDriverWait(driver,20);


public void method1(){

    product_Ele.click();
}


public void method2(){

  //  Wait.until(ExpectedConditions.visibilityOf(image_Ele));
    image_Ele.click();
}

public void method3(){

        link_Ele.click();

}

public void method4(String expresults){
    String act_Results = null;
    System.out.println(expresults);

    act_Results = driver.findElement(By.xpath(".//*[@id='wpmenucartli']/a")).getText();
    System.out.println(act_Results);

    assertEquals(expresults,act_Results);


    cart_Ele.click();
}

public void method5(){

    addcart_Ele.click();
}

public void method6(){

    chkout_Ele.click();
}

public void method7(){

        pp_Ele.click();
}

    public void HeaderTextAssertions1(String expectedheader_results1) {

        String actualheader_Results1 = null;
        System.out.println(expectedheader_results1);

        actualheader_Results1 = driver.findElement(By.xpath(".//*[@id='post-2385']/h1")).getText();
        System.out.println(actualheader_Results1);

        assertEquals(expectedheader_results1, actualheader_Results1);
    }


      public void readPropertyfiles(String propertyFile) throws IOException{
        //to read the path of the destination files

    String filename = System.getProperty("user.dir")+"/src/test/java/Project/propertyFiles/buyitem_%s.properties";
       String host = System.getProperty("host");


    // Read property file with environment host
        File file = new File(String.format(propertyFile,host));

          //loading a property file using java inputstream class
        ///Load properties from a plain text file using an InputStream object:
        FileInputStream fileInput = new FileInputStream(file);

        Properties properties = new Properties();

        properties.load(fileInput);

//        Setting value for a specific property is pretty simple, using this sole method:
//        Object setProperty(String key, String value)
//
//        This method returns previous value of the property specified by the given key.

        firstname = properties.getProperty("firstname");
        lastname= properties.getProperty("lastname");
        email=properties.getProperty("email");
        phone=properties.getProperty("phone");
        country= properties.getProperty("country");
        Address=properties.getProperty("Address");
        city=properties.getProperty("city");
        postcode=properties.getProperty("postcode");
    }

    public void enterDetails() {
    driver.findElement(By.id("billing_first_name")).sendKeys(firstname);

    driver.findElement(By.id("billing_last_name")).sendKeys(lastname);

    driver.findElement(By.id("billing_email")).sendKeys(email);

    driver.findElement(By.id("billing_phone")).sendKeys(phone);

    driver.findElement(By.xpath(".//*[@id='customer_details']/div[1]/div[1]/div/p[5]/p")).click();

    driver.findElement(By.xpath(".//*[@id='select2-billing_country-container']")).sendKeys(country);

    driver.findElement(By.id(".//*[@id='billing_address_1']")).sendKeys(Address);

    driver.findElement(By.xpath(".//*[@id='billing_city']")).sendKeys(city);

    driver.findElement(By.xpath(".//*[@id='billing_postcode']")).sendKeys(postcode);
    }

    public void HeaderTextAssertions2(String expectedheader_results2) {

        String actualheader_Results2 = null;
        System.out.println(expectedheader_results2);

        actualheader_Results2 = driver.findElement(By.xpath(".//*[@id='post-2385']/h1")).getText();
        System.out.println(actualheader_Results2);

        assertEquals(expectedheader_results2,actualheader_Results2);

    }
}