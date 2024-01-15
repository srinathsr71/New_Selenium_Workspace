package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class def1 {
	
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;

@Given("I should go to the login page")
	public void i_should_go_to_the_login_page_preconditions() throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	   Thread.sleep(5000);
	   driver=new ChromeDriver();
	   driver.get(url);
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as_outcomes(String string) throws InterruptedException {
		Thread.sleep(5000);
	    String s=driver.getTitle();
	    //Assert.assertEquals(string, s);
	    driver.close();
}


}
