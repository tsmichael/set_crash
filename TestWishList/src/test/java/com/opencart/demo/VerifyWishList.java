package com.opencart.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyWishList {
    WebDriver driver;

    @BeforeClass
    public void openURL(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/newChr/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testVerifyAddingToWishList(){

        WebElement searchField = driver.findElement(By.xpath("//input[contains(@class,'input-lg')]"));
        searchField.sendKeys("Samsung Galaxy Tab");
        WebElement searchButton = driver.findElement(By.xpath("//button/i[contains(@class,'fa-search')]"));
        searchButton.click();
        WebElement buttonAddToWishList = driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']"));
        buttonAddToWishList.click();

        WebElement dropDown = driver.findElement(By.xpath("//a[contains(@title,'My Account')]"));
        dropDown.click();
        WebElement buttonCaretLogin = driver.findElement(By.xpath("//li/a[contains(@href,'https://demo.opencart.com/index.php?route=account/login')]"));
        buttonCaretLogin.click();

        WebElement emailField = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        emailField.sendKeys("dark@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
        passwordField.sendKeys("qwert1");

        WebElement buttonLogin = driver.findElement(By.xpath("//input[contains(@value,'Login')]"));
        buttonLogin.click();
        WebElement buttonWishList = driver.findElement(By.xpath("//span[contains(text(),'Wish List')]"));
        buttonWishList.click();

        String actualResult;
        if(driver.getPageSource().contains("SAM1")){
            actualResult="Product in WishList";
        }else{
            actualResult="Product is not present";
        }

        Assert.assertEquals(actualResult, "Product in WishList");
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
