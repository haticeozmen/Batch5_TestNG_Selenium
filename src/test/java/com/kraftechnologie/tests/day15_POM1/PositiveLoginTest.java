package com.kraftechnologie.tests.day15_POM1;

import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.kraftechnologie.pages.LoginPage;
import com.kraftechnologie.tests.TestBase;
import com.kraftechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    /**
     * Class Task 2 wrong username
     * go to kraft login page
     * provide valid credentials
     * verify that login successfully
     * */
    @Test
    public void t1_LoginTest() throws InterruptedException {

        driver.get(ConfigurationReader.get("url"));
        loginPage.l_emailInputBox.sendKeys(ConfigurationReader.get("email"));
        loginPage.l_passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        loginPage.l_loginBtn.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.krafttechexlab.com/index");

    }
//    public void login(){
//        String email=ConfigurationReader.get("email");
//        String password=ConfigurationReader.get("password");
//        loginPage.l_emailInputBox.sendKeys("email");
//        loginPage.l_passwordInputBox.sendKeys("password");
//        loginPage.l_loginBtn.click();
//
//    }


    @Test
    public void loginTest2() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));
        loginPage.login();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.krafttechexlab.com/index");

    }
    @Test
    public void test2(){
        driver.get(ConfigurationReader.get("url"));
        loginPage.login("john@gmail.com","John1234.");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.krafttechexlab.com/index");
    }
}
