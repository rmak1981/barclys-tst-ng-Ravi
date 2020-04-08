package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector selectBrowser = new BrowserSelector();

    String baseUrl = "https://www.barclays.co.uk/";

    @BeforeMethod
    public void openBrowser(){

//        selectBrowser.selectBrowser("chrome");

        selectBrowser.selectBrowser("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod

    public void tearDown(){
        driver.quit();;
    }

}
