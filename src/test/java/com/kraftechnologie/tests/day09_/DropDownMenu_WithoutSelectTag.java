package com.kraftechnologie.tests.day09_;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownMenu_WithoutSelectTag {
    WebDriver driver;
    @BeforeMethod
    public void  setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test_getOneOptionWithFindElement(){
        WebElement element = driver.findElement(By.xpath("//div[text()='Select Title')]"));



    }
}
