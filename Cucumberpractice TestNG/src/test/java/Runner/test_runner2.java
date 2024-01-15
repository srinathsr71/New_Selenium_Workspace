package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/loginadmin/login.feature"},glue = "definition2")
public class test_runner2  extends AbstractTestNGCucumberTests {

}