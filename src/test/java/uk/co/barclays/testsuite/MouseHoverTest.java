package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class MouseHoverTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test(priority = 0,groups = {"Smoke"})
    public void userShouldMouseHoverToBank() {
        homePage.mouseHoverBankDropDownLink();
        homePage.clickOnCurrentAccountLink();
    }


}