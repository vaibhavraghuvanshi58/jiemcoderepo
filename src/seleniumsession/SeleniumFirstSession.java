package seleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SeleniumFirstSession extends BaseBrowser{
	public static void main(String[] args) {
		new SeleniumFirstSession().testcase1();
	}
	
	public void testcase1() {
		
		startBrowser();
		// open a site (protocol is mandatory)
		driver.get("http://www.google.com");
		
		// maximise your browser
		driver.manage().window().maximize();
		
		// global wait - implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		name=q
		By googleTextBox = By.name("q");
		WebElement elm =  driver.findElement(googleTextBox);
		elm.sendKeys("Sachin",Keys.ENTER);
		
		 
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.partialLinkText("Sachin Tendulkar - Wikipedia")).click();
		
//		driver.findElement(By.tagName("p"));
		List<WebElement> ls = driver.findElements(By.tagName("p"));
		for(int i = 0 ; i < ls.size() ; i++) {
			WebElement el = ls.get(i);
			System.out.println(el.getText());
		}
		
		
//		driver.quit();
		
	
	}
}
