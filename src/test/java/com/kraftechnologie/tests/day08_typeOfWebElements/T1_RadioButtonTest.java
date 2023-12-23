package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_RadioButtonTest {
    /**

     go to https://www.krafttechexlab.com/forms/radio
     validate that "Checked Radio 1" is already selected*/
    @Test
    public void radioButton(){

        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get(" https://www.krafttechexlab.com/forms/radio");

        WebElement radioButton1=driver.findElement(By.cssSelector("#gridRadios1"));
        System.out.println("radioButton1.isSelected() = " + radioButton1.isSelected());
        Assert.assertTrue(radioButton1.isSelected());

        /**validate that "Radio 2" is not selected*/
        WebElement radioButton2=driver.findElement(By.cssSelector("#gridRadios2"));
        System.out.println("radioButton2.isSelected() = " + radioButton2.isSelected());
        Assert.assertFalse(radioButton2.isSelected());

        /** click on "Radio 2" button validate that "Radio 2" is selected*/
        radioButton2.click();
        System.out.println("radioButton2.isSelected() = " + radioButton2.isSelected());
        Assert.assertTrue(radioButton2.isSelected());
    }
    /**
     go to https://www.krafttechexlab.com/forms/checkbox
     validate that "Checkbox1" is not selected
     validate that "Checkbox2" is already selected*/
    @Test
    public void checkBoxes(){
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBoxes1=driver.findElement(By.cssSelector("#gridCheck1"));
        System.out.println("checkBoxes1.isSelected() = " + checkBoxes1.isSelected());
        Assert.assertFalse(checkBoxes1.isSelected());

        WebElement checkBoxes2=driver.findElement(By.cssSelector("#gridCheck2"));
        System.out.println("checkBoxes2.isSelected() = " + checkBoxes2.isSelected());
        Assert.assertTrue(checkBoxes2.isSelected());
        Assert.assertEquals(checkBoxes2.isSelected(),true);


        driver.quit();

    }
}
