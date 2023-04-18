package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		
        Actions action = new Actions(driver);
        
        action.moveToElement(signIn).build().perform();
        
        
        driver.findElement(By.linkText("Sign in")).click();
        
        driver.findElement(By.id("ap_email")).sendKeys("Batman@123gmail.com");
        
        driver.findElement(By.id("continue")).click();
            
        driver.findElement(By.name("password")).sendKeys("password@123");
        
        driver.findElement(By.id("signInSubmit")).click();
        
        String expectedErrMsg = "Your password is incorrect";
        
        String actualErrMsg = driver.findElement(By.xpath("//span[contains(@class,'a-list-item')]")).getText();
        
        if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
			
		}
		
		driver.quit();
        
        		


				
				
				
	}

}


