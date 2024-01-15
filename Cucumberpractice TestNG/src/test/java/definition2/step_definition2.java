package definition2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition2 {
	
	String url="https://demoapp.skillrary.com/login.php?type=login";
	WebDriver driver;
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("last")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		Thread.sleep(5000);
		WebElement web=driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		String s=web.getText();
		System.out.println(s);		
		Assert.assertEquals(string, s);
		
	}
	
		
}
