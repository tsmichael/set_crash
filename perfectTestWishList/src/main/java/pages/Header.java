package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage {

    By dropDown = By.xpath("//a[contains(@title,'My Account')]");
    By buttonCarretLogin = By.xpath("//a[contains(text(),'Login')]");
    By buttonWishList =By.xpath("//span[contains(text(),'Wish List')]");
    By buttonDesktop = By.xpath("//li[contains(@class,'dropdown')]/a[contains(text(),'Desktops')]");

    public Header(WebDriver driver) {
        super(driver);
    }


    public LoginPage goToLoginPage() {
        click(dropDown);
        click(buttonCarretLogin);
        return new LoginPage(driver);
    }

    public WishListPage goToWishList(){
        click(buttonWishList);
        return new WishListPage(driver);
    }
}
