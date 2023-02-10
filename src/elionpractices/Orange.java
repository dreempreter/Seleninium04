package elionpractices;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orange {
//Task
	//open Chrome Browser
	//Navigate to https://hrm.neotechacademy.com/
	//Print the title of the page
	//Close the browser
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath = System.getProperty("user.dir")+ "/configs/configuration.properties";
	
		
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
		//Starting with Selenium classes and methods
		
		WebDriver driver = null;
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();	
			
		}
		else if(prop.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		
		driver.get(prop.getProperty("url"));
		String title=driver.getTitle();
		System.out.println("Title---> " + title);
		Thread.sleep(3000);
		driver.quit();
	}
}
