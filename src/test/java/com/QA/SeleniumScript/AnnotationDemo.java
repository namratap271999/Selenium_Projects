package com.QA.SeleniumScript;

import org.testng.annotations.Test;

public class AnnotationDemo {
	@Test(priority='1')
    public void TestCase1()
    {
        System.out.println(" Code to log into an application");
    }

	@Test(priority='2')
    public void TestCase2()
    {
        System.out.println(" Code to log into an application1");
    }
	@Test(priority='3')
    public void TestCase3()
    {
        System.out.println(" Code to log into an application2");
    }
}
