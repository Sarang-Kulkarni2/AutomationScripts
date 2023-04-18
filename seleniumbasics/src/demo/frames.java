package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("TREE")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("AbstractFindByBuilder")).click();
		
	}


}
