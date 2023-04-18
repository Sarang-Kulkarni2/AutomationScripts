package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttondemo {
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.id("yes")).click();
		
		boolean barRadiobtnStatus = driver.findElement(By.id("notfoo")).isSelected();
		
		if(barRadiobtnStatus) {
			System.out.println("bar radio button is selected by default");
		}
		else {
			System.out.println("bar radio button is not selected by default");
		}
		
		boolean rememberMeChkbox = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[1]")).isSelected();
		
		if(rememberMeChkbox) {
			System.out.println("remember me checkbox is selected by default");
		}
		else {
			System.out.println("remember me checkbox is not selected by default");
		}
		
		driver.findElement(By.xpath("(input[contains(@type,'checkbox')])[2]")).click();
		
		
		
		
		
	}

}
