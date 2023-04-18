package in.amazon.testscripts;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import in.amazon.pages.Landingpage;
import in.amazon.pages.SignIn;
import utils.ReadExcel;


	public class DDF  extends BaseTest{
		
		@Test
		public void verifyErrMsg() throws IOException {
			
			Landingpage landingPage = new Landingpage(driver);
			landingPage.hoverPointerOverHelloSignInMenu();
			
			
			landingPage.clickSignInBtn();
			
			String[][] data = ReadExcel.getData("resources//Testdata.xlsx", "sheet1");
			
			for(int i=1; i<6; i++) {
				
				String username = data[i][1];
				
				
			
			SignIn signIn = new SignIn(driver);
			signIn.enterUsername(yusername);
			
			
			signIn.clickContinueBtn();
			
		 	
			String expectedErrMSg = "We cannot find an account with that email address";
			String actualErrMsg = signIn.getErrMsg();
			AssertJUnit.assertEquals(actualErrMsg, expectedErrMSg);
			
		  }
		}

	}
