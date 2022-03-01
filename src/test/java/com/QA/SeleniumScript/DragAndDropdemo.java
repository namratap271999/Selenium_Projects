package com.QA.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropdemo {

	public static void main(String[] args) {
		
		
WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://jqueryui.com/droppable/");
        
        driver.switchTo().frame(0);
        
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        
        Actions a = new Actions(driver);
        
        //a.dragAndDrop(source, dest).perform();
        
        a.clickAndHold(source).moveToElement(dest).release().perform();
        
	}

}
