package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    By buttonSearch = By.xpath("//button/i[contains(@class,'fa-search')]");

    String URL = "https://demo.opencart.com";
    By searchField = By.xpath("//input[contains(@class,'input-lg')]");
    By contactUs = By.cssSelector("a[href$='contact'");
    // Max Karrtopelka
    By addToWishListMacBook = By.xpath("//button[@onclick=\"compare.add('43');\"]");
    By addToWishListiPhone = By.xpath("//button[@onclick=\"compare.add('40');\"]");
    By addToWishListiMac = By.xpath("//button[@onclick=\"compare.add('42');\"]");
    By addToWishListCanon = By.xpath("//button[@onclick=\"compare.add('30');\"]");
    By buttonProductComparison = By.cssSelector("a[href$='compare'");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToOpencart() {
        driver.get(URL);
        return this;
    }

    public StorePage searchItem(String product) {
        writeText(searchField, product);
        click(buttonSearch);
        return new StorePage(driver);
    }

    public ComparisonPage addItem() {
        click(addToWishListMacBook);
        click(addToWishListiPhone);
        click(addToWishListiMac);
        click(addToWishListCanon);
        click(buttonProductComparison);
        return new ComparisonPage(driver);
    }
}
