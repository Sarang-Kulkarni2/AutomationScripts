package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	Actions actions;
	
	@FindBy(linkText = "Mobiles")
	private WebElement Mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement helloSignInMenu;
	
	@FindBy(linkText = "Sign in")
	private WebElement signInBtn;
	
	public Landingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickMobile() {
		Mobiles.click();
	}
	
	public void hoverPointerOverHelloSignInMenu() {
		actions.moveToElement(helloSignInMenu).build().perform();
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}


}
