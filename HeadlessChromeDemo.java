package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessChromeDemo {

	public static void main(String[] args) throws Exception
	{
		testboss();
	}

	
	public static void testboss() throws Exception
	{
		System.getProperty("webdriver.chrome.driver","D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1920,1080");
		WebDriver driver=new ChromeDriver(options);
		
	
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	Thread.sleep(3000);
	
		
		
		System.out.println("Completed");
	}
}