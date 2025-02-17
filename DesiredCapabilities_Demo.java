import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilities_Demo {

    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
    	WebDriver driver = new ChromeDriver();
        
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver.exe");
        

        
        // Open Google and perform a search
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("ABCD");
        
        // Click the search button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
        driver.close();
        driver.quit();
    }
}

