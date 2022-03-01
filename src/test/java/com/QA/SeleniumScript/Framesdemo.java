package com.QA.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("classList");
		
		driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
		

	}

}
