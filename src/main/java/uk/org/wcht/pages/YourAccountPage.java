package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class YourAccountPage extends UtilityRM {

    //initiate log4j properties
    private static final Logger log = LogManager.getLogger(YourAccountPage.class.getName());

    @FindBy(xpath = "//input[@id='btn']")
    WebElement _clickOnCreateAcct;

    public void clickOnCreateAcctLnik(){
        Reporter.log("click on create acct link"+_clickOnCreateAcct.toString()+"<br>");
        clickOnElement(_clickOnCreateAcct);
        log.info("click on create acct link"+_clickOnCreateAcct.toString());
    }


}
