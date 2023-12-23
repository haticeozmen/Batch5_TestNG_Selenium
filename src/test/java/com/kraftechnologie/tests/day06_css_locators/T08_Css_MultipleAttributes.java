package com.kraftechnologie.tests.day06_css_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T08_Css_MultipleAttributes {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");


        //
        driver.findElement(By.cssSelector("//input[type='text']//input[type='email']")).sendKeys("mike@gmail.com");
        driver.findElement(By.cssSelector("input[id*='Password']")).sendKeys("mike1234");
        driver.findElement(By.cssSelector("[class*='btn-primary']")).click();
    }

}
