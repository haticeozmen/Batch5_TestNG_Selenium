package com.kraftechnologie.tests.day02_outomationintro;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallWebDriverFactory {
    /**

     TASK
     go to "https://www.krafttechexlab.com/" with chrome by using getDriver() method
     verify that the url is "https://www.krafttechexlab.com/"*/

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.krafttechexlab.com";


        //check if the actual and expected values match or not
        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();
    }


}
