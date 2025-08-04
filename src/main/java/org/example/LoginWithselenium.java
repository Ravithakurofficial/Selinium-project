package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class LoginWithselenium {
    //Getting Web Driver From Main Class Using Constructor
    private WebDriver driver;
    private By emaill = By.name("UserName");
    private By Passwordl = By.name("Password");
    private By btnl = By.cssSelector(".btn");

    //Constructor Class
    public LoginWithselenium(WebDriver driver){
        this.driver = driver;
    }

    //Login Operation
    public HomePage Login(String Email,String Password){
        //give vales to elements
        driver.findElement(emaill).sendKeys(Email);
        driver.findElement(Passwordl).sendKeys(Password);
        driver.findElement(btnl).click();
        //returning to the home page
        return new HomePage(driver);
    }

}
