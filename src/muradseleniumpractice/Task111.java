package muradseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task111 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.navigate().to("https://www.selenium.dev/");
	driver.navigate().to("https://www.amazon.com/");
	
	for(int i =1; i<=10;i++)
	{
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		
	}
	
	driver.quit();
}
}