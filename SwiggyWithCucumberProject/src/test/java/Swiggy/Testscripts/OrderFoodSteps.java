package Swiggy.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import Swiggy.Pages.ViewCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps {
	
	WebDriver driver;
	LandingPage landingPage;

	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	}

	@When("he selects banglore karnataka india from drop down")
	public void he_selects_banglore_karnataka_india_from_drop_down() throws InterruptedException {
	landingPage = new LandingPage(driver);
	landingPage.enterdeliveryLoc();
	}

	@When("he clicks on the first restaurant")
	public void he_clicks_on_the_first_restaurant() throws InterruptedException {
	FirstRestaurant restaurants = new FirstRestaurant(driver);
	restaurants.clickFirstRestaurant();
	}

	@When("he clicks on the add corresponding to the first available dish")
	public void he_clicks_on_the_add_corresponding_to_the_first_available_dish() throws InterruptedException {
	AddDish dish = new AddDish(driver);
	dish.clickaddDish();
	dish.clickaddItem();
	}

	@When("he clicks on the view cart")
	public void he_clicks_on_the_view_cart() {
	ViewCart viewCart = new ViewCart(driver);
	viewCart.clickviewCart();
	}

	@Then("he must be able to see the secure checkout on the final page")
	public void he_must_be_able_to_see_the_secure_checkout_on_the_final_page() throws InterruptedException {
	CheckOut checkOut = new CheckOut(driver);
	String expectedTxt = "SECURE CHECKOUT";
	String actualTxt = checkOut.getCheckoutText();
	Assert.assertEquals(actualTxt, expectedTxt);
	driver.quit();
	}

	}


}
