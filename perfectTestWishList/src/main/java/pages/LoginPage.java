package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By emailField =By.xpath("//input[contains(@name,'email')]");
    By passwordField =By.xpath("//input[contains(@name,'password')]");
    By buttonLogin =By.xpath("//span[contains(text(),'Wish List')]");
    By forgottenPassword = By.xpath("//span[contains(text(),'Forgotten Password')]")

    public LoginPage(WebDriver driver){
        super(driver);
    }


    public LoginPage logIn(String email,String password){
        //write email
        writeText(emailField,email);
        //write password
        writeText(passwordField,password);
        //forfot password


        click(buttonLogin);
        return this;
    }

    public void clickForgottenPassword()
    {
        click(forgottenPassword);
        return this;
    }

}
