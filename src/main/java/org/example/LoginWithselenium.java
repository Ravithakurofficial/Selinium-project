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
    public void Login(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://test.io/company/become-a-tester");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btntxt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div/div[1]/section/div[2]/div[4]/div/a")));
        btntxt.click();
        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(list.size()-1));
        var emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailElement.sendKeys("Test123@gmail.com");
        var passElement = driver.findElement(By.id("user_password"));
        passElement.sendKeys("123456");
        var hidElement = driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div/div[2]"));
        hidElement.click();
    }

}
