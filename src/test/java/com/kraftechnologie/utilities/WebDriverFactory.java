package com.kraftechnologie.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {
    /**

     write a static method that is named getDriver
     it takes a string parameter (browserType)
     it will return a WebDriver based on parameter
     (chrome, safari, firefox) and set up the browser
     for the test*/

    public static void main(String[] args) {

        getDriver("edge");

        getDriver("chorme");
    }
    public static WebDriver getDriver (String browserType ){

//        WebDriverManager.edgedriver().setup();
//        WebDriverManager.chromedriver().setup();
//        if (browserType.equalsIgnoreCase("edge")) {
//            WebDriver driver=new EdgeDriver();
//            driver.manage().window().maximize();
//
//
//        }
//        if (browserType.equalsIgnoreCase("chorme") ) {
//            WebDriver driver=new ChromeDriver();
//            driver.manage().window().maximize();
//
//        }

        WebDriver driver=null;
        switch (browserType.toLowerCase()){
            case"chorme":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case"edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;

        }
        return driver;

    }
}
