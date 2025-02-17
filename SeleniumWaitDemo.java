package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SeleniumWaitDemo {

    public static void main(String[] args) {
        seleniumWaits();
    }

    public static void seleniumWaits() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://www.google.com");
            driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
            driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
            
            // Implementing explicit wait for the search button
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))); // Wait for the button to be visible
            
            // Wait for the button to be clickable after the search results are loaded
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='btnK' and @type='submit']"))); 
            driver.findElement(By.xpath("//input[@name='btnK' and @type='submit']")).click();
        } finally {
            driver.close();
            driver.quit();
        }
    }
}
