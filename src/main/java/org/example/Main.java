package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the ChromeDriver path if not already in PATH

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
    }
}
