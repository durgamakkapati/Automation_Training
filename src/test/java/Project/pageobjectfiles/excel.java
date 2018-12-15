package Project.pageobjectfiles;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class excel {



    //steps:
//    1.To specify the path of the parent directory and the file


    String DIR = System.getProperty("user.dir") + "/src/test/java/project/";

    //method name readexcel

    public void readexcel(String filename, String directory) throws IOException {


        //step2
        //To start with gaining access to Workbook, we should always remember the below command:
        ////Workbook wb = Workbook.getWorkbook(new File("samplefile.xls")); oldmethod

        //to create an instance for the workbook or read the workbook ie parent directory+testdatapackage+filename(dvla)

        Workbook workbook = WorkbookFactory.create(new File(DIR + directory + "/" + filename));//newmethod
        System.out.println(workbook);
        //or

        //step3
        //to get the worksheet ie index 0

        Sheet sheet = workbook.getSheetAt(0);
// to have general format  before display if necessary ie rt click on cell  - format cells-general
        //DataFormatter df= new DataFormatter();

        // data taken in terms of rows and cells not columns
        ArrayList<String> RegNumber = new ArrayList<String>();
        //ArrayList<String> Make = new ArrayList<String>();
        ArrayList<String> Colour = new ArrayList<String>();

// looking for first row in the sheet1 and putting cellvalue of regnumber under reg, cell value of make under make etc
        // loop repeats depending up on the number of rows.

        for (Row row : sheet) {
            System.out.println(row);
            RegNumber.add(row.getCell(0).toString());
            //Make.add(row.getCell(1).toString());
            Colour.add(row.getCell(2).toString());
        }
        System.out.println(RegNumber);
        //System.out.println(Make);
        System.out.println(Colour);
        //System.out.println(exceldata);
    }
}


    //othermethod to get the cell value from excel

    //public   void method1(){
      //  driver.sendKeys(RegNumber.get(1));



