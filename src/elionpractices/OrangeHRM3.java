package elionpractices;

public class OrangeHRM3 extends BaseClass555 {
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	String title = driver.getTitle();
	System.out.println("title--> " + title);
	Thread.sleep(3000);
	//Here we are writing our tests
	
	tearDown();
	
	
}
}
