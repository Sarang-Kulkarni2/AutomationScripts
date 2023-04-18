package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Applephones {
	
	@FindBy(xpath = "(//div[contains(@class,'sg-col-inner')])[4]")
	private WebElement firstPhone;
	
	public Applephones(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFirstPhone() {
		firstPhone.click();
	}

}
