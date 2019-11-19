package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPhonesPage extends BasePage {
    By buttonCompareProduct = By.id("compare-total");

    public CategoryPhonesPage(WebDriver driver) {
        super(driver);
    }

    public CategoryPhonesPage addToComparisonList(String productName) {
        click(getProduct(productName));
        return this;
    }

    public By getProduct(String productName) {
        return By.xpath("//a[contains(text(), '" + productName + "')]/../../..//button[contains(@data-original-title, 'Compare this Product')]");
    }

    public ComparisonPage redirectToComparisonPage() {
        click(buttonCompareProduct);
        return new ComparisonPage(driver);
    }
}
