package definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
	
	WebDriver sri;
	
	@Given("I should be in the login page")
	public void i_should_be_in_the_login_page() {
	   WebDriverManager.chromedriver().setup();
	   sri=new ChromeDriver();
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("Enter password {string}")
	public void enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user should be login page")
	public void user_should_be_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}	

}
