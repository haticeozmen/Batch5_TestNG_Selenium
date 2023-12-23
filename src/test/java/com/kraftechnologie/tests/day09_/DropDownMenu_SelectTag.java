package com.kraftechnologie.tests.day09_;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownMenu_SelectTag {
    WebDriver driver;
    @BeforeMethod
    public void  setUp() throws InterruptedException {
    driver= WebDriverFactory.getDriver("chorme");
    driver.get("https://demoqa.com/select-menu");
    Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test_getOptions(){
        // go to https://demoqa.com/select-menu
        // Old Style Select Menu
        // get all options(web elements) as a list
        //verify that the number of webElement is 11

        WebElement dropDownMenu= driver.findElement(By.cssSelector("#oldSelectMenu"));

        //create a select object(comes from selenium)
        Select select=new Select(dropDownMenu);

        //get all webElements with getOptions() method
        List<WebElement> options=select.getOptions();

        System.out.println("options.size() = " + options.size());

        //validate that size of options is 11
        Assert.assertEquals(options.size(),11);

    }
    @Test
    public void  test_selectByVisibleText(){
        // Old Style Select Menu
        // get the blue thru visible text option and make verification

        //locate dropdown menu
        WebElement dropDownMenu=driver.findElement(By.cssSelector("#oldSelectMenu"));

        //create a select object
        Select select=new Select(dropDownMenu);

        //select blue option with visible text
        select.selectByVisibleText("Blue");

        //get selected webElement and put it into a bucket
        WebElement firstSelectedOption = select.getFirstSelectedOption();

        //validate that text of firstSelectionOption is 'Blue'
        String actual=firstSelectedOption.getText();
        String expected="Blue";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void test_selectByIndexNumber(){
        // Old Style Select Menu
        // get the green option thru visible index number and make verification

        //locate dropdown menu
        WebElement dropDownMenu=driver.findElement(By.cssSelector("#oldSelectMenu"));

        //create a select object
        Select select=new Select(dropDownMenu);

        //select the green option by index number
        select.selectByIndex(2);

        //get the green option and put it in to a bucket
        WebElement firstSelectedOption = select.getFirstSelectedOption();

        //validate that text is 'Green'
        String actual=firstSelectedOption.getText();
        String expected="Green";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test_SelectByValueAttribute(){
        // Old Style Select Menu
        // get the voilet thru value option and make verification

        //locate dropdown menu
        WebElement dropDownMenu=driver.findElement(By.cssSelector("#oldSelectMenu"));

        //create a select object
        Select select=new Select(dropDownMenu);

        //Select voilet webElement by value  attribute
        select.selectByValue("7");

        //get WebElement
        WebElement firstSelectedOption = select.getFirstSelectedOption();

        //validate that text is 'Green'
        String actual=firstSelectedOption.getText();
        String expected="Voilet";
        Assert.assertEquals(actual,expected);

    }

}