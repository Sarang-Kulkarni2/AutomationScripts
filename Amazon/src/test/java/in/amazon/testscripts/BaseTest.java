package in.amazon.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
ChromeDriver driver;
	
	@BeforeClass
	public void launchApplication() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}


}
