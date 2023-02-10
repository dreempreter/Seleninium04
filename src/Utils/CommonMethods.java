package Utils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	/**
	 * This method first clear the textbox and sends some text
	 * 
	 * @param element
	 * @param text
	 */

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * This method checks if radioButoon or checkbox is enabled clicks on the
	 * element that has value that we want to find.
	 * 
	 * @param elementList
	 * @param value
	 */

	public static void clickRadioOrCheckbox(List<WebElement> elementList, String value) {
		for (WebElement el : elementList) {
			String actualValue = el.getAttribute("value").trim();

			if (actualValue.equals(value) && el.isEnabled()) {
				el.click();
				break;
			}

		}
	}

	/**
	 * This method allows us to call Thread.sleep() for any amount of seconds
	 * 
	 * @param seconds
	 */
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	/**
	 * this method checks whether a visible text is found in a drop-down and selects
	 * it
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, String visibleText) {
		try {
			Select sel = new Select(element);
			sel.selectByVisibleText(visibleText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectDropdown(WebElement element, int index) {
		try {
			Select sel = new Select(element);
			int size = sel.getOptions().size();

			if (size > index) {
				sel.selectByIndex(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getAlertText() {
		String alertText = null;
		try {
			Alert alert = driver.switchTo().alert();
			alertText = alert.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alertText;
	}

	public static void sendAlertText(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void switchToFrame(WebElement element) {

		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void switchToChildWindow()
	{
		String mainWindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		
		for(String handle:handles)
		{
		if(!mainWindow.equals(handle))
		{
			driver.switchTo().window(handle);
			break;
		}
		}
	}
	
	
	public static WebDriverWait getWaitObject()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait;
	}
	
	
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will wait for an element to be visible.
	 * 
	 * @param element
	 * @return
	 */
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method waits for an element to be clickable and then clicks on it.
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	
		
		
}

}





