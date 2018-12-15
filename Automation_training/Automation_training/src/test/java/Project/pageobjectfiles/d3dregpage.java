 package Project.pageobjectfiles;

import Project.driverclass;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

 public class d3dregpage extends driverclass {



     public void method1() {
        driver.findElement(By.linkText("Register")).click();
         //System.out.println(driver.getTitle());
        // System.out.println(driver.getCurrentUrl());
    }

    public void method2(String firstname) {


         driver.findElement(By.name("first_name")).sendKeys(firstname);
    }

    public void method3(String lastname) {

         driver.findElement(By.name("last_name")).sendKeys(lastname);
    }

    public void method4(String emailid){
        driver.findElement(By.cssSelector(".cleanlogin-field-email")).sendKeys(emailid);
    }

    public void method5(String password){

         driver.findElement(By.name("pass1")).sendKeys(password);
    }

    public void method6(String npassword){

         driver.findElement(By.name("pass2")).sendKeys(npassword);
    }

    public void method7(){

         driver.findElement(By.name("btn-submit")).click();
    }

     public void HeaderTextAssertions(String expectedHeader_Results) {

         String actualHeader_Results = null;
         System.out.println(expectedHeader_Results);

         actualHeader_Results = driver.findElement(By.cssSelector(".MemberPart>h2")).getText();
         System.out.println(actualHeader_Results);

         assertEquals(expectedHeader_Results,actualHeader_Results);
         //assertNotEquals(expectedHeader_Results,actualHeader_Results);
         //assertTrue(actualHeader_Results.contains("easyJet.com"));


     }
}