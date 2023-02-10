package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazSearch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	String url = "https://www.amazon.com/";
	driver.get(url);
	
	//There are 8 locators to find in the DOM
	//id, name, className, linkText, partialLinkText, tagName, xPath, cssSelector.
	//input[@id='twotabsearchtextbox']
	
	WebElement searchText=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchText.sendKeys("Messi Jersey");
	Thread.sleep(1000);
	
	WebElement searchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchButton.click();
	Thread.sleep(1000);
	
	driver.quit();
	
}

}
