package com.kraftechnologie.tests.day06_css_locators;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T02_Css_With_Id {
    public static void main(String[] args) {
        //.card-title.text-center.pb-0.fs-4
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
    }
}
