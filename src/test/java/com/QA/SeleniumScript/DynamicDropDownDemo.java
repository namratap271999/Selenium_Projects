package com.QA.SeleniumScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownDemo {

	public static void main(String[] args) throws InterruptedException  {
		


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Appium");
        
        Thread.sleep(5000);
        
    List<WebElement> li =     driver.findElements(By.xpath("//*[@class='erkvQe']/descendant::li")); //10
        
    Thread.sleep(5000);
        
        System.out.println(li.size());
        
    for(int i =0;i<li.size();i++)
    {
        String text = li.get(i).getText();
        
        System.out.println(text);
        
        if(text.contains("inspector"))
        {
            li.get(i).click();
            break;
        }
    }
	
	}
        
	        
}
