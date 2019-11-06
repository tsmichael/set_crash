package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class WishListTest extends BaseTest{

    @Test
public void testMethod() {
        HomePage homePage = new HomePage(driver);

        homePage.goToOpencart()
                .searchItem("Samsung Galaxy Tab")
                .addToWishList()
                .logIn()

    }

}
