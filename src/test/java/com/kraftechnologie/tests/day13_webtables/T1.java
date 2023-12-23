package com.kraftechnologie.tests.day13_webtables;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://webdriveruniversity.com/Data-Table/index.html");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void test1() {

        WebElement table = driver.findElement(By.xpath("//table[@id='t01']"));
        System.out.println("table.getText() = " + table.getText());
    }

    @Test
    public void test2() {
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='t01']//th"));
        System.out.println("element = " + elements.size());
        for (WebElement element:elements){
            System.out.println("element.getText() = " + element.getText());

        }
    }
    @Test
    public void test3(){
        //table[@id='t01']//tr
        List<WebElement> elements=driver.findElements(By.xpath("//table[@id='t01']//tr"));
        System.out.println("elements = " + elements);
        List<WebElement>allRowsWithoutHeader=driver.findElements(By.xpath("//table[@id='t01']//td.."));
        System.out.println("allRowsWithoutHeader = " + allRowsWithoutHeader);

    }
    @Test
    public void getRow(){
        WebElement row2 = driver.findElement(By.xpath("(//table[@id='t01']//tr//td/..)[2]"));
        System.out.println("row2 = " + row2.getText());

        System.out.println("");
        //get all rows dynamically and print them one by one
        List<WebElement> allRowsWithoutHeader = driver.findElements(By.xpath("//table[@id='t01']//td/.."));
        for (WebElement element : allRowsWithoutHeader) {
            System.out.println("element.getText() = " + element.getText());
        }
        //get all rows dynamically and print them one by one(with for index loop)
        for (int i = 1; i <=allRowsWithoutHeader.size(); i++) {
            WebElement element = driver.findElement(By.xpath("(//table[@id='t01']//td/..)[" + i + "]"));
            System.out.println(element.getText());



        }
    }


}
