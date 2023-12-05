package com.kraftechnologie.tests.day03_WebElement_Intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatURLChanged {
    /** Class Task D302
     open chrome browser
     go to https://www.krafttechexlab.com/login
     enter email as mike@gmail.com
     enter password as 12345
     click login btn
     verify that Url has changed
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);
        String eMAil="mike@gmail.com";
        String password="mike1234";
        //enter email

        WebElement emailInputBox=driver.findElement(By.id("email"));
        //sendKeys(....) => to type in input element
        //emailInputBox
        emailInputBox.sendKeys(eMAil);

        //enterpassword
       WebElement passwordInputBox= driver.findElement(By.id("yourPassword"));
        passwordInputBox.sendKeys(password);

        //click login button
        WebElement loginBtn=driver.findElement(By.cssSelector("[type=submit]"));
        loginBtn.click();
        Thread.sleep(2000);

        String expectedURL="https://www.krafttechexlab.com/index";
        String actualURL=driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if (expectedURL.equals(actualURL)) {
            System.out.println("PASS");

        }else {
            System.out.println("FAILED");
        }
        Thread.sleep(2000);
        driver.close();



//        Thread.sleep(2000);
//        driver.close();

        //type="password"  type="text"


    }
}
