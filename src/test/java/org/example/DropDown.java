package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropDown {

    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        driver.manage().window().maximize();
        Thread.sleep(15000);
    }
    @Test
    public void DropDown() throws InterruptedException{


        Select select=new Select(driver.findElement(By.id("dropdowm-menu-1")));
        select.selectByValue("sql");
        Thread.sleep(2000);

        Select select1=new Select(driver.findElement(By.id("dropdowm-menu-2")));
        select1.selectByValue("junit");
        Thread.sleep(2000);

        Select select2=new Select(driver.findElement(By.id("dropdowm-menu-3")));
        select2.selectByValue("jquery");
        Thread.sleep(2000);

        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        WebElement k= driver.findElement(By.xpath("//label[normalize-space()='Option 1']"));
        k.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[normalize-space()='Option 3']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[normalize-space()='Option 4']")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//input[@value='purple']")).click();
        Thread.sleep(2000);











    }
}
