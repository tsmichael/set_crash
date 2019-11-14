package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By emailField =By.xpath("//input[contains(@name,'email')]");
    By passwordField =By.xpath("//input[contains(@name,'password')]");
    By buttonLogin =By.xpath("//input[contains(@value,'Login')]");
    By labelForgottenPassword = By.xpath("//div[contains(@class,'form-group')]/a[contains(text(),'Forgotten Password')]");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LogedUserPage logIn(String email,String password){
        //write email
        writeText(emailField,email);
        //write password
        writeText(passwordField,password);
        // click button
        click(buttonLogin);
        return new LogedUserPage(driver);
    }

    public ForgotPasswordPage redirectToForgotPassword(){
        click(labelForgottenPassword);
        return new ForgotPasswordPage(driver);
    }

}
