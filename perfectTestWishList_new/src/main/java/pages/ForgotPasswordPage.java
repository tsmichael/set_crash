package pages;

import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage {

    public ForgotPasswordPage(WebDriver driver){
        super(driver);
    }

    public ForgotPasswordPage isElementContains(String expectedButton){
        String actualResult;
        if(driver.getPageSource().contains(expectedButton)){
            actualResult="Present";
        }
        else{
            actualResult="Not present";
        }
        assertEquals(actualResult);
        return this;
    }


}
