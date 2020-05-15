package frm.testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import frm.driverfactory.DriverFactory;
import frm.modules.Application;
import frm.modules.SearchModule;

public class Sanity {
	
	public void tstcs_open_google_browser() {
		Application.openApp();
		Application.closeApp();
	}
	

	public void tstcs_search_term_in_google_page() {
		Application.openApp();
		SearchModule.search("Sachin");
		SearchModule.validateSearch("Sachin");
		Application.closeApp();
	}
	
	@Test
	public void test3() {
		Application.openApp();
		
		// https://username:password@www.abc.com
		DriverFactory.driver.navigate().to("file:///C:/Users/Vaibhav/Desktop/Training/Corp/site/index.html");
//		DriverFactory.driver.navigate().back();// Back button 
//		DriverFactory.driver.navigate().forward();// Next Button
//		DriverFactory.driver.navigate().refresh(); // F5 Button
//		WebElement fr1 = DriverFactory.driver.findElement(By.xpath("//iframe[@name='frame1']"));
//		DriverFactory.driver.switchTo().frame(fr1);
//		DriverFactory.driver.findElement(By.name("username")).sendKeys("test");
//		DriverFactory.driver.switchTo().defaultContent();

		
		// Action Class
		Actions action = new Actions(DriverFactory.driver);
		WebElement button= DriverFactory.driver.findElement(By.xpath("//button[text()='Clickme']"));
		action.contextClick(button).build().perform();
		//action.keyDown(Keys.DOWN).keyUp(Keys.DOWN).build().perform();
		
		// Css Selector and XPath Axes
		// Convert our project in TestNG
		// JavaScript Executor
		// Thursday - Cucumber - BDD
		
		DriverFactory.driver.findElement(By.xpath("//button[text()='Clickme']")).click();
		Alert alert = DriverFactory.driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		
		// Frames 
		
		
		
		System.exit(1);
		// every tab has its own handle
		DriverFactory.driver.findElement(By.linkText("Google")).click();
		DriverFactory.driver.findElement(By.linkText("Facebook")).click();
		DriverFactory.driver.findElement(By.linkText("Amazon")).click();
		
		String title  = "Facebook – log in or sign up";
		
		System.out.println("Current Handle :  "+DriverFactory.driver.getWindowHandle());
		System.out.println("Title :  "+DriverFactory.driver.getTitle());
		Set<String> handles = DriverFactory.driver.getWindowHandles();
		for(String s : handles) {
			
			DriverFactory.driver.switchTo().window(s);
			if(DriverFactory.driver.getTitle().equals(title)) {
				break;
			}
			
//			if(!s.equals(DriverFactory.driver.getWindowHandle())) {
//				DriverFactory.driver.switchTo().window(s);
//				break;
//			}
		}
		
		System.out.println("Title :  "+DriverFactory.driver.getTitle());
		DriverFactory.driver.findElement(By.name("email")).sendKeys("hello");
		DriverFactory.driver.close(); // close current handle page
		
		
		//DriverFactory.driver.quit(); // will close all the pages
		
		
		
		
		
	}
	
}
