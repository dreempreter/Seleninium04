package muradseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFireFox {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	String url = "https://www.nytimes.com/games/wordle/index.html";
	
	Thread.sleep(1000);
	String currentUrl = driver.getCurrentUrl();
	String title = driver.getTitle();
	
	System.out.println("Title---> " + title );
	System.out.println(" url-> " + url);
	System.out.println(" currentUrl-> " + currentUrl);
	
	
	if(url.equalsIgnoreCase(currentUrl))
	{
		System.out.println("Urls are the same!");
	}
	else
	{
		System.out.println("Urls are not the same!");
	}
		
	Thread.sleep(1000);
		driver.quit();
		
		
}
}
