package com.kraftechnologie.tests.day03_WebElement_Intro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetAttributeExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");


        WebElement emailInputBox=driver.findElement(By.id("email"));
        String value=emailInputBox.getAttribute("type");
        System.out.println(value);
        System.out.println(emailInputBox.getAttribute("name"));
        System.out.println(emailInputBox.getAttribute(""));
    }
}
