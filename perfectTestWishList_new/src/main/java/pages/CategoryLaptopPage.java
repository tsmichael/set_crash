package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CategoryLaptopPage extends BasePage {

    By buttonCompareProduct = By.xpath("//a[contains(@id,'compare-total')]");

    public CategoryLaptopPage(WebDriver driver) {
        super(driver);
    }

    public By CategoryLaptopPage(String productName) {
        return By.xpath("//a[contains(text(), '" + productName + "')]/../../..//button[contains(@data-original-title, 'Compare this Product')]");
    }
//"//strong[contains(text(),'MacBook')]/../../../../..//input[contains(@type,'button')]"
    // maybe i should add products by NUMBER of onclick


    public CategoryLaptopPage addToComparisonList(String productName) {
        click(getProduct(productName));
        return this;
    }

    public By getProduct(String productName) {
        return By.xpath("//a[contains(text(), '" + productName + "')]/../../..//button[contains(@data-original-title, 'Compare this Product')]");
    }

    public ComparisonPage redirectToComparisonPage(){
        click(buttonCompareProduct);
        return new ComparisonPage(driver);
    }



}
