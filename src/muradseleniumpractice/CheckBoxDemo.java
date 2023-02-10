package muradseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//label[@for='RESULT_RadioButton-7_0']
	
	//label[for='RESULT_RadioButton-7_0']
	
	driver.quit();
}
}
