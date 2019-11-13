package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testMethod() {
        HomePage homePage = new HomePage(driver);

        homePage.goToOpencart()
                .redirectToHeader()
                .goToLoginPage()
                .redirectToForgotPassword()
                .isElementContains("Back");
    }
}