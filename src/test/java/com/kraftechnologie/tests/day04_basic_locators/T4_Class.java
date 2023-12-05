package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_Class {
    //TASK
    //go to https://www.krafttechexlab.com/login and login with the valid credentials
    //email --> test@test.com
    //password --> 12345678
    //locate the dashboard button by "class name"
    //VERIFY dashboard string
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();

        WebElement emailBox=driver.findElement(By.id("email"));
        emailBox.sendKeys("test@test.com");

        Thread.sleep(2000);

        WebElement passwordBox=driver.findElement(By.id("yourPassword"));
        passwordBox.sendKeys("12345678");

        Thread.sleep(2000);

        WebElement loginButton=driver.findElement(By.tagName("button"));

        loginButton.click();

        Thread.sleep(2000);

        WebElement dashBoard=driver.findElement(By.className("afm"));
        String actual=dashBoard.getText();
        String expected="Dashboard";
        if (actual.equals(expected))
            System.out.println("PASS");
        else
            System.out.println("FAIL");


    }
}
