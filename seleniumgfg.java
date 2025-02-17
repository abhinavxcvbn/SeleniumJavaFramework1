package gfgtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumgfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = new ChromeDriver();
		String value = "D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", value);

        // Create an instance of ChromeDriver (launch the Chrome browser)
     


            // Navigate to the desired website (GeeksforGeeks in this example)
            driver.get("https://www.geeksforgeeks.org/");
           // driver.findElement(By.linkText("Practice Problem")).click();
            driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("DSA");

            // Get and print the page title
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

        
        
	}

}
