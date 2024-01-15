package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/loginadmin/valid&Invalid.feature"},glue = {"definition9"},tags = "@PositiveTesting")
public class test_runner6 extends AbstractTestNGCucumberTests {

}
