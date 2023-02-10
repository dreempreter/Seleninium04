package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
	/*Using Css ONLY
    TC 2: Mercury Tours Registration: 
        Open chrome browser
        Go to “http://demo.guru99.com/test/newtours/”
        Click on Register Link
        Fill out all required info
        Click Submit
        User successfully registered*/
	public static String url = " https://demo.guru99.com/test/newtours/";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
	///	driver.findElement(By.cssSelector(cssSelector))
		
		
		
		
		
		
		
		
		
		
	}
}
