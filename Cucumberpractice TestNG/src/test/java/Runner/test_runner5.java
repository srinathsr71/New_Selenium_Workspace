package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/loginpostive&negative/user1.feature"},glue = {"definition3"},tags = "@PositiveTesting")
public class test_runner5 extends AbstractTestNGCucumberTests {

}
