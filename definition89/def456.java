package definition89;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class def456 {
	String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver orange;
	
	
	
	@Given("I should be in the login page")
	public void i_should_be_in_the_login_page() {
		WebDriverManager.edgedriver().setup();
		orange=new EdgeDriver();
		orange.get(url);
		orange.manage().window().maximize();
	}
	
	@When("Enter Username {string}")
	public void enter_username(String string) {
	    orange.findElement(By.name("userName")).sendKeys(string);
	}
	@And("Enter password {string}")
	public void enter_password(String string) {
		orange.findElement(By.name("password")).sendKeys(string);
	}
	@Then("user should be login page")
	public void user_should_be_login_page() {
	    orange.findElement(By.name("submit")).click();
	}	
	

}
