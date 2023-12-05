package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Name {
    /*
         *TASK

go to https://www.krafttechexlab.com/login
locate email box by name
locate password box by name
enter data:
email --> test@test.com
password box --> 12345678
VERIFY THAT INPUT BOXES HAVE THE SAME VALUES
*/
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.navigate().to("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();

        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys("test@test.com");

        WebElement passwordInputBox=driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("12345678");

        String actualValues_Email="test@test.com";




    }
}
