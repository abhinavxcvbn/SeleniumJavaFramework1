import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class abhiproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to Google
        driver.get("https://www.google.com/");
        
        // Locate the search box using the correct name attribute
        WebElement textbox = driver.findElement(By.id("input"));
        
        // Optionally, you can send keys to the textbox
        textbox.sendKeys("Selenium WebDriver");
        
        // Close the browser
        driver.close();
	}

}
