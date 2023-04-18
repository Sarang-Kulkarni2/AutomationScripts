package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuos {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		driver.findElement(By.id("Button2")).click();
		
		driver.switchTo().alert().accept();
	}
	
	

}
