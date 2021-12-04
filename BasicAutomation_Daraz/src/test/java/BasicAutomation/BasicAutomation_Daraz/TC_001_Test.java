package BasicAutomation.BasicAutomation_Daraz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_001_Test extends DriverSetup {
	
	
	public static String baseurl="https://www.daraz.com.bd/";
	@Test
	
	public static void daraz() throws InterruptedException {
		
		driver.get(baseurl);
		new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01796795458");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Please enter your password']")).sendKeys("emon624539");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Electronic Accessories')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Computer Accessories')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'HAVIT')]")).click();
		Thread.sleep(3000);
		
		String productTitle="HAVIT GAMENOTE MS1027 Rainbow LED Gaming Mouse - 6 Buttons, 2400 dpi";
		String producttitle=driver.findElement(By.xpath("//a[contains(text(),'HAVIT GAMENOTE MS1027 Rainbow LED Gaming Mouse - 6 Buttons, 2400 dpi')]")).getText();

		//productTitle verify
			
			if(producttitle.equalsIgnoreCase(productTitle)) {
				driver.findElement(By.xpath("//a[contains(text(),'HAVIT GAMENOTE MS1027 Rainbow LED Gaming Mouse - 6 Buttons, 2400 dpi')]")).click();
				Thread.sleep(6000);
			}
			
			else {
				driver.close();
			}
			
	
		
     //   driver.findElement(By.xpath("//img[@alt='HAVIT GAMENOTE MS1027 Rainbow LED Gaming Mouse - 6 Buttons, 2400 dpi']")).click();
       // Thread.sleep(3000);
		
        driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).click();
        Thread.sleep(6000);
	
	}
	

}


