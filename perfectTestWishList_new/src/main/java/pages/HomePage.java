package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String URL = "https://demo.opencart.com";
    By searchField = By.xpath("//input[contains(@class,'input-lg')]");
    By buttonSearch= By.xpath("//button/i[contains(@class,'fa-search')]");
    public HomePage goToOpencart() {
        driver.get(URL);
        return this;
    }

    public StorePage searchItem(String product){
        writeText(searchField,product);
        click(buttonSearch);
        return new StorePage(driver);
    }
}
