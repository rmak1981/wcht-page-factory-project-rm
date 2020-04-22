package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.UtilityRM;

/**
 * Ravi's Creation
 * Date of Creation
 */
public class HomePage extends UtilityRM {

    //initiate log4j properties

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //clicking on your account
    @FindBy(xpath = "//span[contains(text(),'Your account')]")
    WebElement _clickOnYourAccnt;


    public void clickOnYourAccount(){
        Reporter.log("click on your acct link"+_clickOnYourAccnt.toString()+"<br>");
        clickOnElement(_clickOnYourAccnt);
        log.info("click on your acct link"+_clickOnYourAccnt.toString());
    }

}
