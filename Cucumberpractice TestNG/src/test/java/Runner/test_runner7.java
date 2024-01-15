package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/loginadmin/valid&Invaliduser.feature"},glue = {"definition10"},tags = "@PositiveTesting")
public class test_runner7 extends AbstractTestNGCucumberTests {

}
