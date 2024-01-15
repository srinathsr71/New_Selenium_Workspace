package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/loginadmin/signin.feature"},glue = "definition1")
public class test_Runner1  extends AbstractTestNGCucumberTests {

}
