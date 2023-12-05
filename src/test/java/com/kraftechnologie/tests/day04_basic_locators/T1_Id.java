package com.kraftechnologie.tests.day04_basic_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Id {
    /**
     TASK
     go to https://www.krafttechexlab.com/login(chorme)
     locate the email box by id
     locate password box by id
     enter data:
     1.email --> test@test.com
     2.password --> 12345678
     VERIFY THAT INPUT BOXES HAVE THE SAME VALUE
     */
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
        //locate webelement
        WebElement emailInputBox=driver.findElement(By.id("email"));
        //send test@test.com
        emailInputBox.sendKeys("test@test.com");
        Thread.sleep(1500);

        //local webElement (password box)
        WebElement passwordInputBox=driver.findElement(By.id("yourPassword"));
        passwordInputBox.sendKeys("12345678");
        Thread.sleep(1500);

        String actualValue_Email=emailInputBox.getAttribute("value");
        String expectedValue_Email="test@test.com";

        String actualValue_Password=passwordInputBox.getAttribute("value");
        String expectedValue_Password="12345678";

        if (actualValue_Email.equals(expectedValue_Email)&&actualValue_Password.equals(expectedValue_Password))
            System.out.println("\"PASS\" = " + "PASS");
        else
            System.out.println("\"FAIL\" = " + "FAIL");


    }
}
