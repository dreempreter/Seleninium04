package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	/*Homework 1:
	    Using xPath ONLY
	    TC 2: Mercury Tours Registration: 
	        Open chrome browser
	        Go to “http://demo.guru99.com/test/newtours/”
	        Click on Register Link
	        Fill out all required info
	        Click Submit
	        User successfully registered*/
	public static String url = " https://demo.guru99.com/test/newtours/";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Murad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Bayramov");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5183215561");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@size='35']")).sendKeys("murad-bayramov-95@mail.ru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("182 main street");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hudson Falls");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("New York");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("12839");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='country']")).sendKeys("Azerbaijan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dreempreter");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Murad1995$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Murad1995$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@border='0']")).click();
		driver.quit();
		
		
		
		
		
		
	}
}

