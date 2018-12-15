package Project.pageobjectfiles;

import Project.driverclass;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class dvla_page extends driverclass {

    @FindBy(xpath = ".//*[@id='get-started']/a")
    private WebElement start_ele;


    @FindBy(xpath = ".//*[@id='Vrm']")
    private WebElement enter_ele;


    @FindBy(xpath = ".//*[@id='pr3']/div/button")
    private WebElement continue_ele;

       ArrayList<String> RegNumber;//global variables
       ArrayList<String> Colour;

    String DIR = System.getProperty("user.dir") + "/src/test/java/project/";

    public  void method3() {
        continue_ele.sendKeys(RegNumber.get(0));
        continue_ele.sendKeys(Colour.get(1));
    }


    public void clickstartnow() {

        start_ele.click();
    }

    public void readexcel(String filename, String directory) throws IOException {

        Workbook workbook = WorkbookFactory.create(new File(DIR + directory + "/" + filename));
        System.out.println(workbook);
        Sheet sheet = workbook.getSheetAt(0);
         RegNumber = new ArrayList<String>();
       Colour = new ArrayList<String>();

        for (Row row : sheet) {
            System.out.println(row);
            RegNumber.add(row.getCell(0).toString());
            Colour.add(row.getCell(1).toString());
        }
        System.out.println(RegNumber);
        System.out.println(Colour);

    }

    public void enterreg(String registrationnumber) {

        enter_ele.sendKeys(registrationnumber);
    }

    public void cont() {

        continue_ele.click();
    }
}



//    public void HeaderTextAssertions1(String expected_results) {
//
//        String actual_Results = null;
//        System.out.println(expected_results);
//
//        actual_Results = driver.findElement(By.cssSelector(".//*[@id='pr3']/div/ul/li[1]/span[2]")).getText();
//        System.out.println(actual_Results);
//        Assert.assertEquals(expected_results, actual_Results);
//
//
//    }
//
//    public void HeaderTextAssertions2(String expected_results) {
//        String actual_Results = null;
//        System.out.println(expected_results);
//
//        actual_Results = driver.findElement(By.xpath(".reg-mark")).getText();
//        System.out.println(actual_Results);
//
//        Assert.assertEquals(expected_results, actual_Results);
//    }


