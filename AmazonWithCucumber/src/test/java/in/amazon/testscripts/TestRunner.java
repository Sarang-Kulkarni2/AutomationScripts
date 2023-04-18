package in.amazon.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions (
	              features = "Feature",
	            	glue = "in.amazon.testscripts",
	            	tags = "@Regression"
)

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
