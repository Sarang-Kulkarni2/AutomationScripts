package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement FruitDrpDown =    driver.findElement(By.id("fruits"));
		
		Select select = new Select(FruitDrpDown);
		
		select.selectByVisibleText("Mango");
		
		WebElement LangrpDown = driver.findElement(By.id("lang"));
		
		Select select1 = new Select(LangrpDown);
		
		select1.selectByVisibleText("Python");
		
		
		
		
		
	}

}
