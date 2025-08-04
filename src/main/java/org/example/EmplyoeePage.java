package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmplyoeePage {
    private WebDriver driver;

    public EmplyoeePage(WebDriver driver){

        this.driver = driver;
    }
    private By locator3 = By.xpath("/html/body/div[2]/form/a");
    private By Namel = By.id("Name");
    private By Salaryl = By.id("Salary");
    private By DurationWorkedl = By.id("DurationWorked");
    private By Gradel = By.id("Grade");
    private By Emaill = By.id("Email");
    private By btnl = By.xpath("/html/body/div[2]/form/div/div[6]/div/input");


    //Add Emplyoee to site
    public void clickNewEMp(){
        //locate the create new Button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickNewempbtn = wait.until(ExpectedConditions.elementToBeClickable(locator3));
        clickNewempbtn.click();
        //select the element and give value        //submit
        addEmp("Ravi","600000","0",2,"TestThakur123@email.com");

    }
    public void addEmp(String Name,String Salary,String Duration,int option,String email){
        driver.findElement(Namel).sendKeys(Name);
        driver.findElement(Salaryl).sendKeys(Salary);
        driver.findElement(DurationWorkedl).sendKeys(Duration);
        Select select = new Select(driver.findElement(Gradel));
        select.selectByIndex(option);
        driver.findElement(Emaill).sendKeys(email);
        driver.findElement(btnl).click();
    }
}
