package definition9;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class admin_definition extends demoutil {
	
	
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
	public void enter_the_username(String string) {
		
		WebElement we=driver.findElement(By.id("email"));
		demoutil.passingValuesUsingJS(we, string, driver);
	    
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {

		WebElement we=driver.findElement(By.id("password"));
		demoutil.passingValuesUsingJS(we, string, driver);
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		WebElement ele=driver.findElement(By.id("last"));
		demoutil.clickElementByJS(ele, driver);
		
	}
	@And("click on the dropdown button")
	public void click_on_the_dropdown_button() throws IOException {
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//capture a screenshot and store in a location.
//		FileUtils.copyFile(src, new File("C://Users//S R SRINATH//Desktop//seleniumscreenshot//Homepage.png"));//
		WebElement elem=driver.findElement(By.xpath("//*[@class='dropdown user user-menu']/a/span"));
		demoutil.clickElementByJS(elem, driver);
		
		
	}
	@And("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		WebElement web=driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		String s=web.getText();
		System.out.println(s);		
		Assert.assertEquals(string, s);
		
	}
	@Then("Click on the sign out button")
	public void click_on_the_sign_out_button() {
		WebElement wes=driver.findElement(By.linkText("Sign out"));
		demoutil.clickElementByJS(wes, driver);
		driver.close();
	}
	
}
