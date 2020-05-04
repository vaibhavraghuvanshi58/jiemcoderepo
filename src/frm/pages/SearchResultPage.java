package frm.pages;

import org.openqa.selenium.WebDriver;

import frm.driverfactory.DriverFactory;

public class SearchResultPage {
	static WebDriver driver = null;
	public static String getTitle() {
		 driver = DriverFactory.driver;
		 return driver.getTitle();
	}
}
