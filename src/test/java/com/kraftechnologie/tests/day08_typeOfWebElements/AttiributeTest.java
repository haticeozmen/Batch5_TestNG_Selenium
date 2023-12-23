package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Test;

public class AttiributeTest {
    @Test
    public void attributeTest() throws InterruptedException {
        /**go to https://demoqa.com/text-box
         locate FullName webElement and
         get all values of webElement with getAttribute method*/

        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(2000);

        WebElement fullName = driver.findElement(By.cssSelector("label#userName-label"));
        //get value of tagName
        System.out.println("fullName.getAttribute(\"tagName\") = " + fullName.getAttribute("tagName"));
        System.out.println("fullName.getAttribute(\"class\") = " + fullName.getAttribute("class"));
        System.out.println("fullName.getAttribute(\"id\") = " + fullName.getAttribute("id"));
        //if given attribute does not exist --> null
        System.out.println("fullName.getAttribute(\"hatice\") = " + fullName.getAttribute("hatice"));

        //get all data
        System.out.println("fullName.getAttribute(\"outherHTML\") = " + fullName.getAttribute("outherHTML"));
        //get text all webeElement
        //fullName.getText();
        //fullName.getAttribute("value");
        System.out.println("fullName.getAttribute(\"innerHTML\") = " + fullName.getAttribute("innerHTML"));

        Thread.sleep(2500);

        driver.quit();
    }
    @Test
    public void attributesTestRealScenario() throws InterruptedException {
        /**
         go to https://demo.aspnetawesome.com/
         validate that class name of "Celery"
         is o-chkm(unChecked) default*/
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://demo.aspnetawesome.com/");
        //.awe-display.o-ochk>ul>li:nth-of-type(1)
        WebElement celery=driver.findElement(By.cssSelector(".awe-display.o-ochk>ul>li:nth-of-type(1)"));
        //validation
        String actual=celery.getAttribute("class").trim();
        String expected="o-chkm";
        Assert.assertEquals(actual,expected);

        Thread.sleep(2000);

//        celery.click();
//        String actual1=celery.getAttribute("class").trim();
//        String expectt1="o-chkm o-chked";
//        Assert.assertEquals(actual1,expectt1);
//
        celery.click();
        String actual1 = celery.getAttribute("class").trim();
        String expected1 = "o-chkm o-chked";
        Assert.assertEquals(actual1,expected1);
        Thread.sleep(2500);
        driver.quit();




    }
}