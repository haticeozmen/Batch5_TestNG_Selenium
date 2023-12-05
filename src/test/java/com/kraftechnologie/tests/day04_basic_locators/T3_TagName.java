package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_TagName {
    /*
         *TASK

go to https://www.krafttechexlab.com/login
locate login button by tag name
click on login button
VERIFY that URL is still same*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.tagName("button"));

        String urlBeforeClicking=driver.getCurrentUrl();

        Thread.sleep(1000);
        loginButton.click();
        Thread.sleep(1000);
        String urlAfterClicking=driver.getCurrentUrl();

        if (urlBeforeClicking.equals(urlAfterClicking))
            System.out.println("PASS");
        else
            System.out.println("FAIL");




    }
}
