package Project;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
   driverclass driverClass = new driverclass();

    @Before
    public void openBrowser() throws IOException {
        driverClass.openDriver();
    }

    @After
    public void closeBrowser() {

        driverClass.closeDriver();
    }
}
