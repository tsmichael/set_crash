package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class BannerClickTest extends BaseTest {

    @Test
    public void testMethod() {
        HomePage homePage = new HomePage(driver);

        homePage.goToOpencart()
                .clickBanner();
    }
}