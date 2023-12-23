package com.kraftechnologie.tests.day14_properties_Singleton;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public void t_newDriverWithSinleTonTest() {
        WebDriver driver1= WebDriverFactory.getDriver("chorme");
        WebDriver driver2= WebDriverFactory.getDriver("chorme");
        driver1.get("https://www.krafttechexlab.com/login");


    }
}
