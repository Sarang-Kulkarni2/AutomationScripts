package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://instagram.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.name("username")).sendKeys("Sarang kulkarni");
		
		driver.findElement(By.name("password")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("(//div[contains(@class,'_ab8w')])[4]")).click();
		
				
		String expectedErrMsg = "Sorry, your password was incorrect. Please double-check your password.";
		
		String actualErrMsg = driver.findElement(By.id("slfErrorAleart")).getText();
		
				
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
			
		}
		
		driver.quit();
		
	
		
		
		
		
		
		
	}

}
