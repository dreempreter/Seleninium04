package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static String url = "https://www.facebook.com/";
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	
	driver.findElement(By.cssSelector("input#email")).sendKeys("murad-bayramov-95@mail.ru");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("#pass")).sendKeys("Gulparemsin8$");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	String mUrl = "https://www.facebook.com/";
	
	
	
	
	driver.quit();
	
	
}
}
