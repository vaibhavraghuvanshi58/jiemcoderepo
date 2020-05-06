package frm.driverfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import frm.constant.ApplicationConstant;
public class DriverFactory {
	// it will provide driver objects

	private DriverFactory() {

	}

	public static WebDriver driver = null;
	public static WebDriver getWebDriver(String browserName) {
		if(driver == null) {
			// we can create object
			switch(browserName) {
			case "Chrome":
			case "chrome":
			case "Google chrome":
				getChromeDriver();
				break;
			case "firefox":
			case "mozilla":
			case "Mozilla":
				getMozillaDriver();
				break;
			case "ie":
			case "internetexplorer":
			case "IE":
				getIEDriver();
				break;

			default: break;
			}
		}
		return driver;
	}

	private static void getChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstant.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ApplicationConstant.implecitWait,TimeUnit.SECONDS);
	}

	private static void getMozillaDriver() {
		System.setProperty("webdriver.gecko.driver", ApplicationConstant.MOZILLA_DRIVER_PATH);
		driver = new FirefoxDriver();

	}
	private static void getIEDriver() {
		System.setProperty("webdriver.ie.driver", ApplicationConstant.IE_DRIVER_PATH);
		driver = new InternetExplorerDriver();

	}
}
