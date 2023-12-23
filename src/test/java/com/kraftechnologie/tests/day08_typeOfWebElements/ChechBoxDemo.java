package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ChechBoxDemo {
    @Test
    public  void  checkBoxdifferentCases() throws InterruptedException {
        /**
         go to "https://demoqa.com/automation-practice-form"
         validate that sports checkBox is not selected default*/
        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);

        WebElement chechBox=driver.findElement(By.cssSelector("#hobbies-checkbox-1"));

        Assert.assertFalse(chechBox.isSelected());

        //click on chexBox Webelement
        //chechBox.isSelected();

        WebElement parentCheckBox=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']/.."));
        parentCheckBox.click();
        Thread.sleep(2500);

        Assert.assertTrue(parentCheckBox.isSelected());

        Thread.sleep(2500);
        driver.quit();


    }
}
