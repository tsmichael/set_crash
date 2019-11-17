package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparisonPage extends BasePage {

    String itemsInBucketBeforeTest = driver.findElement(By.xpath("//button[contains(@class,'btn btn-inverse btn-block btn-lg dropdown-toggle')]/span[contains(text(),'')]")).getText();
    int count = 0;

    public ComparisonPage(WebDriver driver) {
        super(driver);
    }

    public By getAddToCart(int productNumber) {
        return By.xpath("//input[@onclick=\"cart.add('" + productNumber + "', '1');\"]");
    }

    public By getRemoveFromComparison(int productNumber) {
        return By.cssSelector("a[href$='" + productNumber + "']");
    }

    public ComparisonPage isAvailable(int productNumber) {

        String availabilityState = driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'Availability')]/..//td[2]")).getText();
        if (availabilityState == "In Stock") {
            click(getAddToCart(productNumber));
            click(getRemoveFromComparison(productNumber));
            count++;
        } else {
            click(getRemoveFromComparison(productNumber));
        }
        return this;
    }

    public ComparisonPage checkAdditing() {
        String itemsInBucketAfterTest = driver.findElement(By.xpath("//button[contains(@class,'btn btn-inverse btn-block btn-lg dropdown-toggle')]/span[contains(text(),'')]")).getText();
        int before = Integer.parseInt(this.itemsInBucketBeforeTest);
        int after = Integer.parseInt(itemsInBucketAfterTest);
        String result = "Present";
        if ((before + count) != after) {
            result = "Not present";
        }
        assertEquals(result);
        return this;
    }
}
