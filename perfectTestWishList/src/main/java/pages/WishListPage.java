package pages;

import org.openqa.selenium.WebDriver;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public WishListPage actualResult(){
        String actualResult;
        if(driver.getPageSource().contains("SAM1")){
            actualResult="Product in WishList";
        }else{
            actualResult="Product is not present";
        }
        return this;
    }

}
