package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void shutDown() {
        driver.quit();
    }
}
