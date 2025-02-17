package config;

import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertiesfilegfg{
    @Test
    public void geekforgeeks() throws IOException, InterruptedException {
        FileReader reader=new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\GFG_MAven\\src\\main\\java\\GFG_Maven\\GFG_MAven\\TestData.properties");
        Properties props=new Properties();
        props.load(reader);
        
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
          
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(props.getProperty("searchTerm"));
        Thread.sleep(2000);
        driver.close(); 
    }
}
