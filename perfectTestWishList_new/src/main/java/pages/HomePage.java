package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    By buttonSearch = By.xpath("//button/i[contains(@class,'fa-search')]");

    String URL = "https://demo.opencart.com";
    By searchField = By.xpath("//input[contains(@class,'input-lg')]");
    By contactUs = By.cssSelector("a[href$='contact']");
    // Max Karrtopelka
    By addToWishListMacBook = By.xpath("//button[@onclick=\"compare.add('43');\"]");
    By addToWishListiPhone = By.xpath("//button[@onclick=\"compare.add('40');\"]");
    By addToWishListiMac = By.xpath("//button[@onclick=\"compare.add('42');\"]");
    By addToWishListCanon = By.xpath("//button[@onclick=\"compare.add('30');\"]");
    By buttonProductComparison = By.cssSelector("a[href='https://demo.opencart.com/index.php?route=product/product&path=57&product_id=49']");
    // TsMichael
    By addToCartMacBook=By.xpath("//button[@onclick=\"cart.add('43');\"]");
    By addToCartiPhone =By.xpath("//button[@onclick=\"cart.add('40');\"]");
    By buttonBucket = By.id("cart");
    // romanSkaskiv
    By buttonBanner = By.cssSelector("a[href$='id=49']");

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

    public HomePage addToBucket(){
        click(addToCartiPhone);
        click(addToCartMacBook);
        click(buttonBucket);
        return this;
    }

    public SamsungGalaxyTabPage clickBanner() {
        click(buttonBanner);
        return new SamsungGalaxyTabPage(driver);
    }
}
