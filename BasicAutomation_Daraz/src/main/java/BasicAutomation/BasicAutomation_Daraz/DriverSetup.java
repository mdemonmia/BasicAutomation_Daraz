package BasicAutomation.BasicAutomation_Daraz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver;
	

    @BeforeSuite
	public static void SetDriver() {
    	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
    
    @AfterSuite
	public static void close() {
		driver.quit();
		
	}
}
