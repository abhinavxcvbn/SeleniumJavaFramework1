package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver=null;
	String projectPath=System.getProperty("user.dir");

    @Parameters("browserName")
     @BeforeTest
    public void setup(String browserName)
	{
      
		System.out.println("Browser name is:"+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", projectPath+"/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver", projectPath+"/geckodriver-v0.35.0-win64/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
	}
     @Test
	public void test1() throws Exception
	{
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	}
     
     @AfterTest
     public void teardown() {
         if (driver != null) {
             driver.close();
         } else {
             System.out.println("Driver was not initialized. No browser to close.");
         }
         System.out.println("Test Completed Successfully");
}
}