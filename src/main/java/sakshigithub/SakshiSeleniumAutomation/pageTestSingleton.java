package sakshigithub.SakshiSeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class pageTestSingleton {
	WebDriver driver;

	@BeforeMethod
	public void setup() {

		// Create Object of DriverInit Singleton Class
		DriverInit driver_instance = DriverInit.getInstance();

		// Call the non static method
		driver_instance.openChromeBrowser();
	}

	@Test
	public void titleCheck() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
