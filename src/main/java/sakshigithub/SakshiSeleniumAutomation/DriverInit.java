package sakshigithub.SakshiSeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	// PRIVATE STATIC CLASS VARIABLE
	private static DriverInit driver_instance = null;

	// PRIVATE NON_STATIC CLASS VARIABLE
	private WebDriver driver;

	// PRIVATE CONSTRUCTOR
	private DriverInit() {

	}

	// PUBLIC-LAZY INITIALIZATION - PUBLIC STATIC METHOD
	public static DriverInit getInstance() {
		if (driver_instance == null) {
			driver_instance = new DriverInit();
		}
		return driver_instance;

	}

	// PUBLIC-method
	public WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
