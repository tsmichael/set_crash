package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    By buttonSearch = By.xpath("//button/i[contains(@class,'fa-search')]");

    String URL = "https://demo.opencart.com";
    By searchField = By.xpath("//input[contains(@class,'input-lg')]");
    By contactUs = By.cssSelector("a[href$='contact']");

    By contactIcon = By.xpath("//i[contains(@class, 'fa fa-phone')]/../..//a");

    By buttonProductComparison = By.cssSelector("a[href$='compare']");
    By addToCartMacBook = By.xpath("//button[@onclick=\"cart.add('43');\"]");
    By addToCartiPhone = By.xpath("//button[@onclick=\"cart.add('40');\"]");
    By buttonBucket = By.id("cart");
    // romanSkaskiv
    By addToWishListMacBook = By.xpath("//button[@onclick=\"wishlist.add('43');\"]");
    By addToWishListiPhone = By.xpath("//button[@onclick=\"wishlist.add('40');\"]");
    By addToWishListiMac = By.xpath("//button[@onclick=\"wishlist.add('42');\"]");
    By addToWishListCanon = By.xpath("//button[@onclick=\"wishlist.add('30');\"]");
    By buttonWishList = By.cssSelector("a[href$='wishlist']");
    By buttonCategoryLaptops = By.xpath("//li/a[contains(text(),'Laptops & Notebooks')]");
    By buttonSemiCategoryShowAllLaptops = By.xpath("//div[contains(@class,'dropdown-menu')]/a[contains(text(),'Show All Laptops & Notebooks')]");
    By buttonCategoryPhones = By.xpath("//a[contains(text(),'Phones & PDAs')]");

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

    public ComparisonPage goToComparisonPage() throws InterruptedException {
        Thread.sleep(5000);
        click(buttonProductComparison);
        return new ComparisonPage(driver);
    }

    public HomePage addToComparisonList(String productName) {
        click(getCompariseButton(productName));
        return this;
    }

    public By getCompariseButton(String productName) {
        return By.xpath("//a[contains(text(), '" + productName + "')]/../../..//button[contains(@data-original-title, 'Compare this Product')]");
    }


    public HomePage addToBucket() {
        click(addToCartiPhone);
        click(addToCartMacBook);
        click(buttonBucket);
        return this;
    }

    public SamsungGalaxyTabPage clickBanner() {
        click(addToWishListMacBook);
        click(addToWishListiPhone);
        click(addToWishListiMac);
        click(addToWishListCanon);
        click(buttonWishList);
        return new SamsungGalaxyTabPage(driver);
    }

    public CategoryLaptopPage redirectToCategoryLaptop() {
        click(buttonCategoryLaptops);
        click(buttonSemiCategoryShowAllLaptops);
        return new CategoryLaptopPage(driver);
    }

    public CategoryPhonesPage redirectToCategoryPhones() {
        click(buttonCategoryPhones);
        return new CategoryPhonesPage(driver);
    }

    public Header redirectToHeader() {
        return new Header(driver);
    }
}
