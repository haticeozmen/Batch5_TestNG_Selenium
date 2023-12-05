package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_PartialLinkText {
/*
         *TASK

go to https://www.krafttechexlab.com/login
locate "Create an account" button by partialLinkText
click on the button
verify that url is "https://www.krafttechexlab.com/register"*/

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement createAnAccount=driver.findElement(By.partialLinkText("an account"));
        createAnAccount.click();

        Thread.sleep(1000);

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.krafttechexlab.com/register";
        Thread.sleep(1000);
        if (actualUrl.equals(expectedUrl))
            System.out.println("PASS");
        else
            System.out.println("FAIL");



    }
}
