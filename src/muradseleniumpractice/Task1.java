package muradseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.selenium.dev/");
	driver.navigate().to("https://github.com/");
	
	for(int a=1; a<=3; a++)
	{
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
	
}
}
