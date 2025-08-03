package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Set the ChromeDriver path if not already in PATH

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        driver.manage().window().fullscreen();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        String data = driver.getCurrentUrl();
        String source = driver.getPageSource();
        if(source.contains(data)){
            System.out.println("Present and working");
        }
        else{
            if(source.contains("youtube")){
                System.out.println("This is else");
            }
        }
        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
        driver.get("https://www.linkedin.com/in/ravithakurofficial/");
        for(String s : list){
            System.out.println(s);
        }
        driver.get("https://www.linkedin.com/login");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("session_key")));
        WebElement pass = driver.findElement(By.name("session_password"));
        WebElement subBut = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("Your mail");
        pass.sendKeys("YourPassword");
        subBut.click();
        driver.close();
        driver.close();
    }
}
