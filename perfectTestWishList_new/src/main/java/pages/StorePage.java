package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver){
        super(driver);
    }

    By buttonAddToWishList = By.xpath("//button[contains(@data-original-title,'Add to Wish List')]");

    public StorePage addToWishList(){
        click(buttonAddToWishList);
        return this;
    }

    public Header redirectToHeader(){
        return new Header(driver);
    }
}
