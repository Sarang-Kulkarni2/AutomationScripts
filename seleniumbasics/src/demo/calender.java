package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://expedia.co.in");
		
		driver.findElement(By.id("d1-btn")).click();
		
		WebElement nextMonth = driver.findElement(By.xpath("//table[contains(@class,'date-picker')])[2]"));
	
		List<WebElement> nextMonthRows = nextMonth.findElement(By.tagName("tr"));
		
		
		
	
		
		
	}

}
