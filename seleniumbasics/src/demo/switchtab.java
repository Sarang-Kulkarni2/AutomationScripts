package demo;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchtab {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		
		
		driver.findElement(By.linkText("Instagram")).click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		
		String winHandleofInstagram = tabs.get(1);
		
		driver.switchTo().window(winHandleofInstagram);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));


		driver.findElement(By.name("username")).sendKeys("abc123@gmail.com");
	}

}
