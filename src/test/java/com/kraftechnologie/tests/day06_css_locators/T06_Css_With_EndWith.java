package com.kraftechnologie.tests.day06_css_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T06_Css_With_EndWith {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        //webelementleri buşlmada sondan başlayarak

        //h5[class^='card-title'] -- [class$='fs-4']
        WebElement loginTitleText = driver.findElement(By.cssSelector("[class$='fs-4']"));
        System.out.println(loginTitleText.getText());

        //
        driver.findElement(By.cssSelector("input[id^='email']")).sendKeys("mike@gmail.com");
        driver.findElement(By.cssSelector("input[id$='Password']")).sendKeys("mike1234");
        driver.findElement(By.cssSelector("[class$='w-10']")).click();

    }
}
