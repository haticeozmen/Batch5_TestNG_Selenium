package com.kraftechnologie.tests.day14_properties_Singleton;

import com.kraftechnologie.utilities.ConfigurationReader;
import com.kraftechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver= Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
       // driver.close();
        Driver.closeDriver();

    }

    @Test
    public void t_positiveLoginTest() {
        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.id("email")).sendKeys(ConfigurationReader.get("email"));
        driver.findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("password"));
        driver.findElement(By.xpath("//button[.='Login']")).click();
    }

    @Test
    public void t_anotherLoginTest() {
        driver.get(ConfigurationReader.get("url"));
        WebElement emailInputBox= driver.findElement(By.id("email"));
        WebElement password= driver.findElement(By.id("yourPassword"));
        emailInputBox.sendKeys(ConfigurationReader.get("email"));
        password.sendKeys(ConfigurationReader.get("password")+ Keys.ENTER);
        //driver.findElement(By.xpath("//button[.='Login']")).click();

    }
}
