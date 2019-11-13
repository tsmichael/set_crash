package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class ComparisonTest extends BaseTest {

    @Test
    public void testMethod() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.goToOpencart()
                .addToComparisonList("MacBook")
                .addToComparisonList("iPhone")
                .addToComparisonList("Apple Cinema 30")
                .addToComparisonList("Canon EOS 5D")
                .goToComparisonPage();
    }
}
