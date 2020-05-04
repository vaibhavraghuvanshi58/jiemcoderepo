package frm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frm.driverfactory.DriverFactory;

public class SearchFormPage {
	
	public static By txt_searchbox =  By.name("q");
	public static By btn_googleSearch = By.name("btnK");
	public static By lnk_Gmail = By.linkText("Gmail");
	
	
	static WebDriver driver ;
	
	public static void enterSearchTerm(CharSequence...searchText) {
		 driver = DriverFactory.driver;
		 driver.findElement(txt_searchbox).sendKeys(searchText);
	}
	
	public static void clickGoogleSearch() {
		 driver = DriverFactory.driver;
		 driver.findElement(btn_googleSearch).click();
	}
	public static void clickGmailLink() {
		 driver = DriverFactory.driver;
		 driver.findElement(lnk_Gmail).click();
	}
}
