package frm.modules;

import org.openqa.selenium.WebDriver;

import frm.constant.ApplicationConstant;
import frm.driverfactory.DriverFactory;

public class Application {
	static WebDriver driver = null;
	
	public static void openApp() {
		// Application Open
		DriverFactory.getWebDriver(ApplicationConstant.browsername);
		driver = DriverFactory.driver;
		//driver.get(ApplicationConstant.ApplicationURL);
		System.out.println("Browser has been open with title : " + driver.getTitle());
	}
	
	public static void closeApp() {
		driver.quit();
		DriverFactory.driver = null;
	}
	
}
