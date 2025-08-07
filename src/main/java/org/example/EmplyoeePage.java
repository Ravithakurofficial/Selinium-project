package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmplyoeePage {
    private WebDriver driver;

    public EmplyoeePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[2]/form/a")
    private WebElement locator3 ;
    @FindBy(id = "Name")
    private WebElement Namel ;
    @FindBy(id = "Salary")
    private WebElement Salaryl ;
    @FindBy(id = "DurationWorked")
    private WebElement DurationWorkedl;
    @FindBy(id = "Grade")
    private WebElement Gradel ;
    @FindBy(id = "Email")
    private WebElement Emaill ;
    @FindBy(xpath = "/html/body/div[2]/form/div/div[6]/div/input")
    private WebElement btnl ;


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
        Namel.sendKeys(Name);
        Salaryl.sendKeys(Salary);
        DurationWorkedl.sendKeys(Duration);
        Select select = new Select(Gradel);
        select.selectByIndex(option);
        Emaill.sendKeys(email);
        btnl.click();
    }
}
