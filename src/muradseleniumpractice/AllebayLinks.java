package muradseleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllebayLinks {

	public static String url = "https://www.ebay.com/str/lordofthebookss";
	
	public static void main(String[] args) {
		/*
		 * Go to the ebay.com 
		 * Get All links on ebay and their numbers 
		 * Print the links that have a text
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		
		int count = 0;
		for(WebElement link : allLinks)
		{
			if(!link.getText().isEmpty()) //if link is not empty
			{
				System.out.println(link.getText());
				count++;
			}
			
		}
		
		System.out.println("The number of links that have text is " + count);
		System.out.println("The total number of links " +allLinks.size());
		
		driver.quit();
	}
	

}
