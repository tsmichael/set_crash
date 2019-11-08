package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogedUserPage extends BasePage {

    public LogedUserPage(WebDriver driver) { super(driver); }

    public Header redirectToHeader() {
        return new Header(driver);
    }

}
