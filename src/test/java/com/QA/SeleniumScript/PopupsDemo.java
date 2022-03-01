package com.QA.SeleniumScript;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		

		driver.manage().window().maximize();
		
driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
        
       
// identify the element until which we have to scroll

WebElement e1 = driver.findElement(By.id("win2"));

JavascriptExecutor js = ((JavascriptExecutor)driver);

js.executeScript("arguments[0].scrollIntoView(true);", e1);

e1.click();
//from Sonal Mittal (Trainer) to All Participants:
// As we will click a new window will appear

Set<String> s1 = driver.getWindowHandles();

// start an iterator

Iterator<String> itr = s1.iterator();

     String parent_window  = itr.next(); // fetch the first value from the Set
     System.out.println(parent_window);

     
     String child_window = itr.next(); // fetch the next value from the Set
     System.out.println(child_window);
     
     driver.switchTo().window(child_window);
     
     driver.manage().window().maximize();
     
     String title=driver.getTitle();
        
     driver.findElement(By.name("q")).sendKeys("Appium");
     
     Thread.sleep(2000);
     
     driver.switchTo().window(parent_window);
     
     Thread.sleep(2000);
      
     driver.close();//only open window is close
     
    // driver.quit();//close all windows in that seession
        
	}

}
