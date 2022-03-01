package com.QA.SeleniumScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BforeAfterClass {
	
public WebDriver driver;
    
    @BeforeClass
    public void startbrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();    
    }
    
    @Test(priority='1')
    public void TestWikiHomepage() throws InterruptedException
    {
        driver.get("https://www.wikipedia.org/");
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.findElement(By.id("searchInput")).sendKeys("Automation testing");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

@Test(priority='2')
    public void TestWikiLoginPage()
    {
        driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
        driver.findElement(By.id("wpName1")).sendKeys("sonal04");
        driver.findElement(By.id("wpPassword1")).sendKeys("sonal@1234");
    }
    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }
	    

}
