package in.Swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	@FindBy(id = "location")
	private WebElement addressTxtBox;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterAdd(String email) {
		addressTxtBox.sendKeys(email);
	}
	

}
