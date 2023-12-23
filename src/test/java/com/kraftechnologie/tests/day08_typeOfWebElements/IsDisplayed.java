package com.kraftechnologie.tests.day08_typeOfWebElements;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsDisplayed {
    /**
     * go to https://the-internet.herokuapp.com/dynamic_loading/1
     * validate that Start button is displayed
     */
    @Test
    public void displayedTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//button[.='Start']"));
        System.out.println("startButton.isDisplayed() = " + startButton.isDisplayed());
        Assert.assertTrue(startButton.isDisplayed());



        /**

         validate that 'Hello World' webElement is not displayed before click on Start button*/
        WebElement helloWord = driver.findElement(By.xpath("//h4[.='Hello World!']"));

        System.out.println("helloWord.isDisplayed() = " + helloWord.isDisplayed());

        driver.quit();
    }
}
