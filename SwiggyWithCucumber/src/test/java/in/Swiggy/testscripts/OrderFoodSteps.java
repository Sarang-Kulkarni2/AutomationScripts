package in.Swiggy.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import in.Swiggy.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps {
	WebDriver driver;
	LandingPage landingPage;
	
	
	
	@Given("user is on the landing page of Swiggy")
	public void user_is_on_the_landing_page_of_swiggy() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		
	}

	@When("he enters an address {string} in the delivery text-box")
	public void he_enters_an_address_in_the_delivery_text_box(String string) {
		 landingPage = new LandingPage(driver);
		 landingPage.enterAdd(string);
		
	   
	}

	@When("he clicks on first available Restaurant")
	public void he_clicks_on_first_available_restaurant() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("he clicks on add first available food")
	public void he_clicks_on_add_first_available_food() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("he clicks on view cart")
	public void he_clicks_on_view_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("he must be able to Order the food successfully")
	public void he_must_be_able_to_order_the_food_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	

}
