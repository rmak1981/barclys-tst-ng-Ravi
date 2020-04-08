package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    By bankDropDownLink = By.linkText("Bank");
    By borrowDropDownLink = By.linkText("Borrow");

    public void mouseHoverBankDropDownLink(){
        mouseHoverToElement(bankDropDownLink);
    }
    public void mousehoverBorrowDropDownLink(){
        mouseHoverToElement(borrowDropDownLink);
    }

}
