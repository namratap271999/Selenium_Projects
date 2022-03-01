package com.QA.SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		  
		driver.get("https://www.wikipedia.org/");
		
//Close the browser window
        
        //Thread.sleep(2000); // add wait time before closing the window
        
        //driver.close(); // will close that particular browser window
		
	
	}


}
