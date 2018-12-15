package Project;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class driverclass {

    public static WebDriver driver;

    public void openDriver() throws IOException {
        String browser;
        String host;

        browser = System.getProperty("browser");
        host = System.getProperty("host");
        System.out.println(browser);

        if (browser.equalsIgnoreCase("CHROME")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();

        } else if (browser.toUpperCase().equals("FIREFOX")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }

        //1: Read property files
        //File file = new File("C:\\Users\\G S Sastry\\IdeaProjects\\Automation_training\\src\\test\\java\\Project\\propertyFiles\\environment_preprod.properties");


        String filename = System.getProperty("user.dir")+"/src/test/java/Project/propertyFiles/environment_%s.properties";


        File file = new File(String.format(filename,host));
        FileInputStream fileInput = new FileInputStream(file);
        Properties properties = new Properties();

        properties.load(fileInput);

        String url = properties.get("URL").toString();





        //2: Read the urls from property files.


        driver.get(url);
        driver.manage().window().maximize();


    }

    public void closeDriver() {
        driver.quit();
    }
}
