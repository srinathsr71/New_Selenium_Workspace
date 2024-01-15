package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/login123/demo.feature"} ,glue = {"definition"},tags = "@PositiveTesting")
public class test_runner extends AbstractTestNGCucumberTests {

}
