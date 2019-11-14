package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    @Test
//    @Description("Title of TestCase from TestRail")
    public void testMethod() {
        HomePage homePage = new HomePage(driver);

        homePage.goToOpencart()
                .addToBucket();

    }

}
