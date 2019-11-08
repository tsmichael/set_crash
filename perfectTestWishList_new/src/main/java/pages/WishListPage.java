package pages;

import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public WishListPage isElementContains(String expectedNameProduct){
        String actualResult;

        if(driver.getPageSource().contains(expectedNameProduct)){
            actualResult="Product in WishList";
        }else{
            actualResult="Product is not present";
        }

        assertEquals(actualResult);
        return this;
    }

}
