package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.Applephones;
import in.amazon.pages.Buyphone;
import in.amazon.pages.Landingpage;
import in.amazon.pages.SignIn;

public class ByMobilePhoneTest {
	//1) Open the browser
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
	}
	
	@Test
	public void buyMobile() {
		
		Landingpage landingpage = new Landingpage(driver);
		
		landingpage.clickMobile();
		
		AllMobileBrands allMobileBrands = new AllMobileBrands(driver);
		allMobileBrands.hoverOverMobileAndAccessories();
		
		allMobileBrands.clickApple();
		
		Applephones applephones = new Applephones(driver);
		applephones.clickFirstPhone();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		String windowHandleOfSecondTab = tabs.get(1);
		driver.switchTo().window(windowHandleOfSecondTab);
		
		
		Buyphone buyphone = new Buyphone(driver);
		buyphone.clickBuyNowBtn();
		
		
		SignIn signIn = new SignIn(driver);
		String expectedText = "Sign in";
		String actualText  = signIn.getSignInText();
	    Assert.assertEquals(actualText, expectedText);
				
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
