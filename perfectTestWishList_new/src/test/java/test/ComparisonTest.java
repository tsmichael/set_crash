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

    @Test
    public void test_AddingToCartOnlyINSTOCK(){
        HomePage homePage=new HomePage(driver);

        homePage.goToOpencart()
                .redirectToCategoryLaptop()
                .addToComparisonList("MacBook Pro")
                .addToComparisonList("Sony VAIO")
                .addToComparisonList("HP LP3065")
                .redirectToComparisonPage()
                .isAvailable(45)
                .isAvailable(46)
                .isAvailable(47)
                .checkAdditing();




        ;
    }
}
