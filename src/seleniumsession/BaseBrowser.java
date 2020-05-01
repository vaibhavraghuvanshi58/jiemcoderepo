package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseBrowser {
	
	WebDriver driver = null;
	
	public void startBrowser() {
		
		String driverPath = "C:\\Users\\Vaibhav\\git\\jiemcoderepo4\\driver\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		
		
	}
}
