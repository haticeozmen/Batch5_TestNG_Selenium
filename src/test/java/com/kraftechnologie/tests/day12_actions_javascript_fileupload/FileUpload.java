package com.kraftechnologie.tests.day12_actions_javascript_fileupload;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void test1(){

        /**

         create a file on your Desktop named "test.txt"
         go to https://the-internet.herokuapp.com/upload
         upload the file and validate*/
        driver.get("https://the-internet.herokuapp.com/upload");
        String path="C:/Users/hatic/Desktop/test.txt";
        WebElement filebutton = driver.findElement(By.cssSelector("#file-upload"));
        filebutton.sendKeys(path);

        driver.findElement(By.cssSelector("#file-submit")).click();
        WebElement verificationPoint = driver.findElement(By.cssSelector("#uploaded-files"));
        Assert.assertTrue(verificationPoint.getText().contains("test.txt"));
    }
    @Test
    public void selenium(){
        /**

         create a file on your Desktop named "Selenium.txt"
         move this folder into resources file
         go to https://the-internet.herokuapp.com/upload
         upload the file and validate*/
        driver.get("https://the-internet.herokuapp.com/upload");
        String path="C:/Users/hatic/Desktop/test.txt";
        WebElement filebutton = driver.findElement(By.cssSelector("#file-upload"));
        //System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
        //System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        String projectPath=System.getProperty("user.dir");
        String filePath="src/test/resources/selenium.txt";
        String fullPath =projectPath+"/"+filePath;

        filebutton.sendKeys(fullPath);

        driver.findElement(By.cssSelector("#file-submit")).click();
        WebElement verificationPoint = driver.findElement(By.cssSelector("#uploaded-files"));
        Assert.assertTrue(verificationPoint.getText().contains("selenium.txt"));



    }
}