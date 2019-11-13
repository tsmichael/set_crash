package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class WishListAddTest extends BaseTest {

    @Test
    public void testMethod() {
        HomePage homePage = new HomePage(driver);

        homePage.goToOpencart()
                .clickBanner();
    }
}