package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) { super(driver); }

    String URL = "https://demo.opencart.com";
    //String product  = "Samsung Galaxy Tab";
    //@FindBy(xpath = "//input[contains(@class,'input-lg')]")
    //public WebElement searchField
    By searchField = By.xpath("//input[contains(@class,'input-lg')]");
    By contactUs = By.cssSelector("a[href$='contact']");
    //@FindBy(xpath = "//button/i[contains(@class,'fa-search')]")
    //public WebElement buttonSearch;
    By buttonSearch = By.xpath("//button/i[contains(@class,'fa-search')]");
    By buttonAddToWishList = By.xpath("//button[contains(@data-original-title,'Add to Wish List')]");

    public HomePage goToOpencart() {
        driver.get(URL);
        return this;
    }

    public HomePage searchItem(String product) {
        writeText(searchField, product);
        click(buttonSearch);
        return this;
    }

    public HomePage addToWishList() {
        click(buttonAddToWishList);
        return this;
    }
}
