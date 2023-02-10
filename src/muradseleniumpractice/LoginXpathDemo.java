package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {
	public final static String url1 = "http://neotechacademy-sis.com:9000/Test/Default.aspx";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url1);
		
//relative
//     //*[@id="tUsername"] star means anything
		driver.findElement(By.xpath(" //*[@id=\'tUsername'] ")).sendKeys("Admin");
		//tag[@attribute='value'
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");
		
		Thread.sleep(3000);
		//lets click submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		//customized xpath
		////a[contains(text(), 'Students')]
		
		
		//lets try to click  on students link
		driver.findElement(By.xpath("//a[contains(text(), 'Students')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
		
		