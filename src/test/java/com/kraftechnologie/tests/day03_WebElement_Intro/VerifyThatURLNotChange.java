package com.kraftechnologie.tests.day03_WebElement_Intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatURLNotChange {
    /** Class Task D301
     *  open the chrome browser
     *  go to https://www.krafttechexlab.com/login page
     *  click login button
     *  verify that url did NOT changed
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);
        String expectedURL=driver.getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);
        //findElement() and Click()

        WebElement loginBtn=driver.findElement(By.cssSelector("[type='submit']"));
        loginBtn.click();

        //String ecpectedURL=
        String actualURL=driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if (expectedURL.equals(actualURL)) {
            System.out.println("PASS");

        }else {
            System.out.println("FAILED");
        }
        Thread.sleep(2000);
        driver.close();
    }

}
