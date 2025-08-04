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
    LoginWithselenium loginWithselenium;
    public static void main(String[] args) {
        // Set the ChromeDriver path if not already in PATH

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        LoginWithselenium log = new LoginWithselenium();
        log.Login();
    }
}
