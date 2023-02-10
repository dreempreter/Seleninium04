package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSerachCss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String url = "https://www.amazon.com/";
	driver.get(url);
	
	WebElement searchButton=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	searchButton.sendKeys("Iphone 13 pro max");
	Thread.sleep(1000);
	WebElement searchCliclk=driver.findElement(By.cssSelector("input#nav-search-submit-button"));
	searchCliclk.click();
	Thread.sleep(1000);
	driver.quit();
	
	
}
}
