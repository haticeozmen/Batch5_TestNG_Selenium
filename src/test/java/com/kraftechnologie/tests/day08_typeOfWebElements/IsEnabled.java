package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsEnabled {
    /**
     go to https://the-internet.herokuapp.com/dynamic_controls
     validate that uninteractable button is disabled*/
    @Test
    public void disableElementTest() throws InterruptedException
            {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement textBoxt=driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("textBoxt.isEnabled() = " + textBoxt.isEnabled());
        Assert.assertFalse(textBoxt.isEnabled());

        WebElement enable=driver.findElement(By.xpath("//*[.='Enable']"));
        enable.click();

        Thread.sleep(4500);
        Assert.assertTrue(textBoxt.isEnabled());

        driver.quit();
    }

}
