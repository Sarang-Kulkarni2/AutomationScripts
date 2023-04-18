package Swiggy.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {
	Actions actions;

	@FindBy(xpath = "//a[contains(@class,'_1T-E4')]")
	private WebElement viewCart;

	public ViewCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	}

	public void clickviewCart() {
	viewCart.click();
	}
	}



