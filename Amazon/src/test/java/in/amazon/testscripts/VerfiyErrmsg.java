package in.amazon.testscripts;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import in.amazon.pages.Landingpage;
import in.amazon.pages.SignIn;

public class VerfiyErrmsg extends BaseTest{
	
	@Test
	public void verifyErrMsg() {
		
		Landingpage landingPage = new Landingpage(driver);
		landingPage.hoverPointerOverHelloSignInMenu();
		
		
		landingPage.clickSignInBtn();
		
		SignIn signIn = new SignIn(driver);
		signIn.enterUsername("Sarang4455@gmail.com");
		
		
		signIn.clickContinueBtn();
		
		
		String expectedErrMSg = "We cannot find an account with that email address";
		String actualErrMsg = signIn.getErrMsg();
		AssertJUnit.assertEquals(actualErrMsg, expectedErrMSg);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
