package pages;

import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public WishListPage isElementContains(String expectedNameProduct){
        String actualResult;
        if(driver.getPageSource().contains(expectedNameProduct)){
            actualResult="Present";
        }else{
            actualResult="Not Present";
        }
        assertEquals(actualResult);
        return this;
    }

}
