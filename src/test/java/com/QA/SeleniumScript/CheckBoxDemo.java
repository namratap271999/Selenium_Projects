package com.QA.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//*[contains(@name,'color')]")).click();
	
	 Thread.sleep(2000);
     
    // driver.findElement(By.xpath("(//*[contains(@name,'color')])[3]")).click();
	
	

	}

}
