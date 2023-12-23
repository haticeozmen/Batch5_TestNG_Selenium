package com.kraftechnologie.tests.day05_xpath;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbsoluteXpath {
    /*

TASK
go to https://www.krafttechexlab.com/
get the 'Home' webElement by absolute xpath
get the 'Dashboard' webElement by absolute xpath
validate text of webElements*/

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/");
        driver.manage().window().maximize();
        WebElement homeElement= driver.findElement(By.xpath("/html/body/main/div/nav/ol/li/a"));


    }
}
