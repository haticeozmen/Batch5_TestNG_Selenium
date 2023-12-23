package com.kraftechnologie.tests.day12_actions_javascript_fileupload;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class javaScriptExecutorDemo {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
      //  driver.quit();
    }

    @Test
    public void clickWithJS(){
        /**

         ANOTHER CLİCK METHOD
         go to "https://www.krafttechexlab.com/components/listgroup"
         locate Fifth Checkbox
         try to select it with Selenium click() method
         try to select it with JS and validate that it is selected*/
        driver.get("https://www.krafttechexlab.com/components/listgroup");
        WebElement targetCheckBox=driver.findElement(By.xpath("(//input[@class='form-check-input me-1'])[5] "));
       // targetCheckBox.click();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        //click with JS
        jse.executeScript("arguments[0].click();",targetCheckBox);
        Assert.assertTrue(targetCheckBox.isSelected());


    }
    @Test
    public void test(){
        /**

         ANOTHER TYPE METHOD
         go to "https://the-internet.herokuapp.com/dynamic_controls"
         type "Hello World" in to disabled text box with JS*/
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
        String text="Hello Word";
        JavascriptExecutor jse=(JavascriptExecutor)driver;

        jse.executeScript("arguments[0].setAttribute('value','"+text+"')",textbox);

        driver.findElement(By.xpath("(//*[contains(text(),'Enable')])[3]")).click();
    }
    @Test
    public void scrollDownAndUp() throws InterruptedException {
        driver.get("https://www.amazon.com.tr/");
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        /**

         go to https://www.amazon.com.tr/
         scroll the page down and up with JS*/
        driver.findElement(By.cssSelector("#sp-cc-accept")).click();
        for (int i = 0; i <10 ; i++) {
            //scroll down the page
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,500)");

        }
        for (int i = 0; i <10 ; i++) {
            //scroll down the page
            Thread.sleep(1000);
            jse.executeScript("window.scrollBy(0,-100)");

        }

    }
    @Test
    public void scrollToElement(){
        /**

         go to https://www.amazon.com.tr/
         scroll the page to target element(Almanya) in one shot with JS*/
        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.cssSelector("#sp-cc-accept")).click();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        WebElement germany = driver.findElement(By.xpath("(//*[.='Almanya'])[2]"));
        //scroll to target webElement in one shot

        jse.executeScript("arguments[0].scrollIntoView(true);",germany);



    }
}
