package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    By bankDropDownLink = By.linkText("Bank");
    By currentAccountsLink = By.xpath("//div[@class='nav-l3']//a[contains(text(),'Current accounts')]");

    public void mouseHoverBankDropDownLink(){ mouseHoverToElement(bankDropDownLink); }
    public void clickOnCurrentAccountLink(){clickOnElement(currentAccountsLink);}

}
