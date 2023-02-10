package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	//there are 8 ways/locators to find the element in the dom//document object model
	//ID, name, className, linkText, parcialLinkText, tagName, xPath, cssSelector
	
	WebElement searchText=driver.findElement(By.id("twotabsearchtextbox"));
	searchText.sendKeys("clothes");
	Thread.sleep(1000);
	WebElement searchButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text]/inpu"));
	Thread.sleep(1000);
	driver.close();
	// //*[@id="nav-search-submit-text"] --find any ---> in work with double quots and singl
	
	// //span[@id='nav-search-submit-text]/input-->find child input -- find specific
}
}
