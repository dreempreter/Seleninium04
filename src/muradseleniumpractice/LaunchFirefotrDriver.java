package muradseleniumpractice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFirefotrDriver {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	
	driver.getTitle();
	System.out.println(driver.getTitle());
	
	driver.close();
	//driver.quit();
	
}
}
