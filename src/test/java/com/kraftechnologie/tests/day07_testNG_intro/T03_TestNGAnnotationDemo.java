package com.kraftechnologie.tests.day07_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T03_TestNGAnnotationDemo {
    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void test1() {
        System.out.println("First test case");
        Assert.assertEquals("title","title","titlet is not match");
        System.out.println("Second test case");
        Assert.assertEquals("url","url");

    }

    @Test
    public void test2() {
        System.out.println("Second test case");
        Assert.assertEquals("test2","test2","test2 is not match");

    }

    @Test
    public void test3() {
        String expectedTitle="Kraft";
        String actualTitle="KraftTech";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"verify that title starts with Kraft");
    }

    @Test
    public void test4() {
        String email="batch5@kraftech.com";
        if (email.contains("@"))
            System.out.println("pass");
        else
            System.out.println("failed");

        Assert.assertTrue(email.contains("@"));

    }

    @Test
    public void test5() {
        Assert.assertFalse(1<0,"verify that 0 is not greater that 1");
    }

    @Test
    public void test6() {
        Assert.assertNotEquals("two","one");
    }

    @AfterMethod
    public void tearDown() {

    }
}
