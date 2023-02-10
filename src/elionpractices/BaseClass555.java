package elionpractices;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass555 {
	public static WebDriver driver;
	
	

	/**
	 * This method will initialize the driver
	 */
	public static void setUp() {
		ConfigsReader.readProperties(Constance.CONFIGURATION_FILEPATH);

		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constance.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constance.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported!!!");
		}

		driver.manage().window().maximize();
		driver.get("https://hrm.neotechacademy.com/");
	}

	/**
	 * This method will quit the browser
	 */
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
