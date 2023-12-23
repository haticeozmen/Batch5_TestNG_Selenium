package com.kraftechnologie.tests.day09_;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {
    WebDriver driver;


    @Test
    public void findElementsWithoutCorrectFormula(){
        /*

go to https://www.krafttechexlab.com/javascript/clicks
try to locate any web element with findElements() method with a wrong formula
see how it behaves*/
        WebDriver driver = WebDriverFactory.getDriver("chorme");
        driver.get("https://www.krafttechexlab.com/javascript/clicks");
        List<WebElement>wrongFormula=driver.findElements(By.xpath("wrongformula"));



    }
}
