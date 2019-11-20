package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparisonPage extends BasePage {

    String itemsInBucketBeforeTest = driver.findElement(By.xpath("//button[contains(@class,'btn btn-inverse btn-block btn-lg dropdown-toggle')]/span[contains(text(),'')]")).getText();
    public int count = 0;

    public ComparisonPage(WebDriver driver) {
        super(driver);
    }

    public ComparisonPage availableAddToCart() {
        int numberTd = driver.findElements(By.xpath("//tbody/tr/td[contains(text(),'Availability')]/..//td")).size();
        for (int i = 1; i <= numberTd; i++) {
            WebElement aw = driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'Availability')]/..//td[" + i + "]"));
            String availabilityState = aw.getText();
            if (aw.getText().equals("In Stock")) {
                String[] itemsBefore = itemsInBucketBeforeTest.split(" ");
                int before = Integer.parseInt(itemsBefore[0]);
                By buttonAddToCart = By.xpath("//input[contains(@value,'Add to Cart')]/../..//td[" + i + "]/input");
                click(buttonAddToCart);
                count++;
            }
        }
        return this;
    }

    public ComparisonPage itemsInBucket() {
        String[] itemsBefore = itemsInBucketBeforeTest.split(" ");
        int before = Integer.parseInt(itemsBefore[0]);
        int actual = before + count;
        System.out.println(actual);
        return this;
    }
}
