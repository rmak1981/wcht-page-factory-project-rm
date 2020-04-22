package uk.org.wcht.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.pages.YourAccountPage;
import uk.org.wcht.testbase.TestBase;

/**
 * Ravi's Creation
 * Date of Creation
 */
public class TestCase1 extends TestBase {

    HomePage homePage;
    YourAccountPage yourAccountPage;

    @BeforeMethod(groups = {"Regression"})
    public void setUp(){

        homePage = new HomePage();
        yourAccountPage = new YourAccountPage();

    }

    @Test(priority = 1,groups = {"Regression"})
    public void userShouldCreateAccountSuccessfully(){

        homePage.clickOnYourAccount();
        yourAccountPage.clickOnCreateAcctLnik();
    }
}
