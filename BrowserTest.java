import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
    	 WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver.exe");
        
     
   
        
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
