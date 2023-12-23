package com.kraftechnologie.tests.day07_testNG_intro;

import org.testng.annotations.*;

public class T02_BeforeAfterMethod {

    @Test
    public void test1() {
        System.out.println("First test case");
        System.out.println("Go to Amazon");
        System.out.println("write selenium in the search box ");
        System.out.println("verify that result text has selenium");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("************** Before method **************");
        System.out.println("Web driver, Opening Chorme");


    }

    @AfterMethod
    public void tearDown() {
        System.out.println("************** After method **************");
        System.out.println("Closing browser, close");
    }

    @Test @Ignore
    public void test2() {
        System.out.println("second test case");
    }

    @Test
    public void test3() {
        System.out.println("tree test case");
    }

    @BeforeClass
    public void setupClass() {
        System.out.println("************** Beforme Classs **************");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("************** After method **************");

    }
}