package com.QA.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//select[@name='coffee']"));
		
		Select dd=new Select(e1);
		
		dd.deselectByIndex(1);
		
		Thread.sleep(1000);
		
		dd.selectByValue("cream");
		
		Thread.sleep(2000);
		
		// select by visible text
		
		dd.selectByVisibleText("With sugar");
	}

}
