package muradseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.amazon.com/");
	//will wait for the wepsite elements to loaded
	
	driver.navigate().to("https://www.amazon.com/");
	//will not wait for the elements to loaded but will keep history
	driver.navigate().to("https://classroom.google.com/u/0/c/NTQ3NTU0NjEzMjAy/m/NTcyMjU0MzkzNzk3/details");
	
	Thread.sleep(500);
	
	driver.navigate().refresh();
	
	Thread.sleep(1000);
	driver.navigate().back();
	//will go to previous page
	driver.navigate().forward();
	
	Thread.sleep(2000);
	
	driver.close();
	
}
}
