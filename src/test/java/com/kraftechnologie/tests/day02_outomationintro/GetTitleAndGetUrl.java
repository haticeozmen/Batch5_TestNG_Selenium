package com.kraftechnologie.tests.day02_outomationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    /**

     TASK
     Open chorme and navigate to https://www.krafttechnologie.com/
     get title and display (then verify)
     get current url and display (then verify)
     get pageSource and display*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.krafttechnologie.com");
        //title alıp
        String actual=driver.getTitle();
        String expected="Kraft Technologie | Uzaktan Eğitim  Merkezi";

        if (actual.equals(expected)) {
            System.out.println("Title PASS");
        }else {
            System.out.println("Title FAIL");
        }
        //sayfanın url'ni aldık
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String actuaUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.krafttechnologie.com/tr/index";

        if (actuaUrl.equals(expectedUrl)) {

            System.out.println("Url PASS");
        }else {
            System.out.println("Url FAIL");
        }
        //webpage'ın source kodunu  aldık
        System.out.println("driver.getPageSource() = " + driver.getPageSource());
        String sourceCode=driver.getPageSource();

    }
}
