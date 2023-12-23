package com.kraftechnologie.tests.day10_typeOfWebElements_3;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpAndAlerts {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void t_htmlPopUp() throws InterruptedException {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=533ff");
        driver.findElement(By.xpath("//span[.='Confirm']")).click();
        // Alert class does NOT work with HTML pop UP
//        Alert alert=driver.switchTo().alert();
//        Thread.sleep(2000);
//        //click to OK
//        alert.accept();

        // driver.findElement(By.xpath("//span[.='Yes']")).click();
        Thread.sleep(1000);
        String expectedMessage="You have accepted";
        String actualMessage= driver.findElement(By.xpath("//p[text()='You have accepted']")).getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void js_Alert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Click for JS Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        // switch to Alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1000);
        //click to OK
        alert.accept();

        Thread.sleep(1000);

        //Click for JS Confirm
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        Thread.sleep(1000);
        // get text to JS Pop UP
        System.out.println("alert.getText() = " + alert.getText());
        //click to CANCEL
        alert.dismiss();

        Thread.sleep(1000);
        //Click for JS Prompt
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        //sendKeys to JS Prompt
        alert.sendKeys("KraftTech B5 is here");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(1000);

        //HW Task
        // verify all result above JS Alert


    }
}