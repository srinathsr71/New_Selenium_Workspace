package definition90;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class def34 {
	String url="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver1;
	
	
	
	@Given("I should be in the login page")
	public void i_should_be_in_the_login_page() {
		WebDriverManager.edgedriver().setup();
		driver1=new EdgeDriver();
		driver1.get(url);
		driver1.manage().window().maximize();
	}
	
	@When("Enter Username {string}")
	public void enter_username(String string) {
	    driver1.findElement(By.name("userName")).sendKeys(string);
	}
	@And("Enter password {string}")
	public void enter_password(String string) {
		driver1.findElement(By.name("password")).sendKeys(string);
	}
	@Then("user should be login page")
	public void user_should_be_login_page() {
	    driver1.findElement(By.name("submit")).click();
	}	

}
