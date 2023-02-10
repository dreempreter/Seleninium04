package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSselectorDemo {
	
	public static String url = " http://neotechacademy-sis.com:9000/Test/Default.aspx";
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//using xpath = //*[@id="tUsername"]
	//using css
	driver.get(url);
	driver.findElement(By.cssSelector("#tUsername")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#tPassword")).sendKeys("Neotech$123");
	//click on login
	driver.findElement(By.cssSelector(".buttonBig")).click();
	//  a[href$='Personal.aspx']
	
	driver.findElement(By.cssSelector("a[href$='Personal.aspx']")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
