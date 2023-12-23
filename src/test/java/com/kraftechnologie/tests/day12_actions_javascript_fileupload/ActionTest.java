package com.kraftechnologie.tests.day12_actions_javascript_fileupload;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ActionTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,15);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void hoverOver(){
        /**

         1th Main Action (Hover Over)
         go to "https://the-internet.herokuapp.com/hovers"
         hover mouse over first image
         verify that "name: user" is visible
         verify the text*/
    driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        //hover the maouse over the target webElement
        actions.moveToElement(element).perform();
        driver.findElement(By.xpath("//h5[contains(text(),'user1')]"));
    }

    @Test
    public void dragAndDrop(){
        /**

         2nd Main Action (Drag and Drop)
         go to https://demoqa.com/droppable
         take "Drag me" webElement, move it on to "Drop here" and leave on it
         verify that 'Dropped!' webElement is visible*/
        driver.get("https://demoqa.com/droppable");
        WebElement source = driver.findElement(By.xpath("//div[.='Drag me']"));

        WebElement target = driver.findElement(By.xpath("(//p[.='Drop here'])[1]"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();
        WebElement dropped=driver.findElement(By.xpath("//p[.='Dropped']"));
        Assert.assertEquals(dropped.getText(),"Dropped!");

    }
}
