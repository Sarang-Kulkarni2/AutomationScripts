package in.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMsgSteps {
	WebDriver driver;
	LandingPage landingPage;
	SignIn signIn;
	
	@Given("a user is on landing page")
	public void a_user_is_on_landing_page() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
	    
	}

	@When("he hovers the pointer over Hello Sign In menu")
	public void he_hovers_the_pointer_over_hello_sign_in_menu() {
	    landingPage = new LandingPage(driver);
	    landingPage.hoverOverHelloSignInMenu();
	}

	@When("he clicks on Sign-in button in the sub-menu")
	public void he_clicks_on_sign_in_button_in_the_sub_menu() {
		landingPage.clickSignInBtn();
	    
	}


@When("he enters an invalid username {string} in the email text-box")
public void he_enters_an_invalid_username_in_the_email_text_box(String string) {
    signIn = new SignIn(driver);
    signIn.enterEmail(string);
    		
}

	@When("he clicks on the continue button")
	public void he_clicks_on_the_continue_button() {
		signIn.clickContinueBtn();
	    
	}

	@Then("he must see an error message - {string}")
	public void he_must_see_an_error_message(String string) {
	    String expecteErrMsg = string;
	    String actualErrMsg = signIn.getErrMsg();
	    Assert.assertEquals(actualErrMsg, expecteErrMsg);
	    driver.quit();
	}

}
