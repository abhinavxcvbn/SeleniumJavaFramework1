package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListener.class)
public class TestNGListenersDemo {
	@Test
public void test1()
{
	System.out.println("I am inside test 1");
}
	@Test
public void test2()
{
	System.out.println("I am inside test 2");
	 WebDriver driver = new ChromeDriver();
     System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver.exe");
     
  

     
     // Navigate to Google
     driver.get("https://www.google.com/");
     
     // Locate the search box using the correct name attribute
     WebElement textbox = driver.findElement(By.name("q"));
     
     // Optionally, you can send keys to the textbox
     textbox.sendKeys("Selenium WebDriver");
     
     // Close the browser
     driver.close();
}
	@Test
public void test3()
{
	System.out.println("I am inside test 3");
	throw new SkipException("This test is skipped");
}
}
