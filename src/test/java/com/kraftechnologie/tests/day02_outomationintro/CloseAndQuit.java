package com.kraftechnologie.tests.day02_outomationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAndQuit {
    /**

     TASK-1
     open safari browser
     go to "https://www.krafttechexlab.com/"
     close the browser with close() method
     *
     TASK-2
     go to "https://www.amazon.com/"
     close the browser with quit() method
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup(); //microsoft edge browser
        WebDriverManager.chromedriver().setup(); //chorme edge browser

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.krafttechexlab.com");
        Thread.sleep(2000);

        driver.close();//browsere kapat
        //close() methodu geçerli methodu kapatır.

        WebDriver driver1=new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.amazon.com");
        driver1.quit();//browsere kapat
        //qut() methodu browseri kapatır.,




    }
}
