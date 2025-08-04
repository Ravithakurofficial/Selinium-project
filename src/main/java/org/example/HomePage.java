package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Login
    private By locator = By.linkText("Login");


    //EmplyoeeList
    private  By Locator2 = By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a");

    public LoginWithselenium clickLogin(){
        driver.findElement(locator).click();
        return new LoginWithselenium(driver);
    }

    public EmplyoeePage clickemplist(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement locator2btn = wait.until(ExpectedConditions.elementToBeClickable(Locator2));
        locator2btn.click();
        return new EmplyoeePage(driver);
    }







}
