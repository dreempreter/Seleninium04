package muradseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TextBox {
	
	public static String url = " https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get(url);
	
	//1st way
	
	driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Murad");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
	driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Bayram");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("#RESULT_TextField-2")).sendKeys("Muti");
	
	
	//2nd way code redundancy and reusability
	
	WebElement fname = driver.findElement(By.xpath("//input[@name='RESULT_TextField-1'"));
	fname.clear();
	fname.sendKeys("Ahmet");
	
	String idAttribute = fname.getAttribute("id");
	System.out.println("The value of the id attribute is : " + idAttribute);
	
	WebElement Iname = driver.findElement(By.cssSelector("#RESULT_TextField-2"));
	Iname.clear();
	Iname.sendKeys("Enes");
	
	System.out.println("The value of the class Attriubite " + Iname.getAttribute("class"));
	Thread.sleep(1000);
	
	WebElement header = driver.findElement(By.xpath("//h1[text()='Volunteer Sign Up']"));
	String headerText = header.getText();
	System.out.println("The header is : " + headerText);
	Thread.sleep(1000);
	
	driver.quit();
	
	
}
}
