package muradseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	String url = "https://www.instagram.com/";
	//driver.get(url); 
	//this will wait for page element to be loaded
	//this will not keep history
	
	driver.navigate().to(url);
	//this will not wait the elements to be loaded
	//this will keep history
	Thread.sleep(1000);
	
	driver.manage().window().maximize(); // will make full screen

	Thread.sleep(1000);
	
	String fakeNews = "https://www.foxnews.com/";
	driver.navigate().to(fakeNews);
	Thread.sleep(500);
	
	String fifa = " https://www.fifa.com/";
	driver.navigate().to(fifa);
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(500);
	
	driver.navigate().back();
	
	driver.navigate().forward();
	Thread.sleep(1000);
	
	driver.navigate().refresh();
	Thread.sleep(1000);
	
	driver.quit();
}
}
