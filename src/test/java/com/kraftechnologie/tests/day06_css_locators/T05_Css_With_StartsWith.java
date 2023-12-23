package com.kraftechnologie.tests.day06_css_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T05_Css_With_StartsWith {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
        WebElement loginTitleText = driver.findElement(By.cssSelector("h5[class^='card-title']"));
        System.out.println(loginTitleText.getText());
        //starts with by xpath  input[starts-with(@id,'em')]
        //css starts-with input[id^='email']
        driver.findElement(By.cssSelector("input[id^='email']")).sendKeys("mike@gmail.com");
        driver.findElement(By.cssSelector("input[id^='yourP']")).sendKeys("mike1234");
        driver.findElement(By.cssSelector("[class^='btn']")).click();

        ////button[starts-with(@class,'btn')]



    }
}
