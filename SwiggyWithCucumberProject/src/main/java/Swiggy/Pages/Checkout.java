package Swiggy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	Actions actions;
	//span[contains(@class,'_2EQ3T')]
	@FindBy(xpath = "//span[contains(@class,'_2EQ3T')]")
	private WebElement checkOut;

	public void CheckOut(WebDriver driver) {
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	}

	public String getCheckoutText() throws InterruptedException {
	Thread.sleep(2000);
	return checkOut.getText();
	}
	}


