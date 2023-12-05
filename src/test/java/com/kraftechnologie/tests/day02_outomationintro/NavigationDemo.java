package com.kraftechnologie.tests.day02_outomationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TASK
         open chrome and navigate to "https://www.google.com/"
        go to "https://www.amazon.com/"
        go back (google)
        go forward (amazon)
        refresh the page (amazon)
        */
        public class NavigationDemo {
        public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // driver.get("https://www.google.com/");

        driver.navigate().to("https://www.google.com/");

        driver.manage().window().maximize();

        // 2 sn bekler
        Thread.sleep(2000);

        // go to amazon
        driver.navigate().to("https://www.amazon.com/");

        Thread.sleep(2000);

        // back to google
        driver.navigate().back();

        Thread.sleep(2000);

        //forward to amazon
        driver.navigate().forward();

        Thread.sleep(2000);

        // refresh in page
        driver.navigate().refresh();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        String actual= driver.getTitle();
        String expected= "Amazon.com";

        if (actual.equals(expected)){
        System.out.println("PASS");
        }else{
        System.out.println("FAIL");
        }
        }

        }