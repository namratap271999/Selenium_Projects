package com.QA.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtomDemo {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.xpath("(//[contains(@name,'radio')})[1]"));
	
	boolean sel=e1.isSelected();
	
	if(sel==false)
	{
	
	  e1.click();
	}

	}

}
