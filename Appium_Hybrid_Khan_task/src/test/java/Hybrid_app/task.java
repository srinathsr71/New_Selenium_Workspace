package Hybrid_app;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
public class task {
	
	
	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void beforetest() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "H://Downloads//chromedriver.exe");
		driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test(enabled=true,priority=0)//sign in
	public void Signin() throws InterruptedException
	{
		
		Thread.sleep(5000);
		
		System.out.println("Welcome to Khan Acadamy");
				
		Thread.sleep(15000);
				
		driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
		
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"sr.srinath8@gmail.com\")").click();
		
		Thread.sleep(5000);
		
		
	}
	
	@Test(enabled=true,priority=1)
		public void selectLanguage() throws InterruptedException
		{
			
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select language\"))").click();
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)) "+
		         ".scrollIntoView(new UiSelector().text(\"Select language\"))")).click();
			Thread.sleep(5000);
			
			driver.findElement(MobileBy.xpath("//*[@text='English (default)']")).click();
			Thread.sleep(3000);
			
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			
				
		}
	
	@Test(enabled=true,priority=2)
	public void explore1() throws InterruptedException//playing vedio
	{
		
		Thread.sleep(8000);
		
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		Thread.sleep(4000);
		
		driver.findElementByAndroidUIAutomator("text(\"Life skills\")").click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"Internet safety\")").click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"Online data security\")").click();
		Thread.sleep(4000);
		
		driver.findElementByAndroidUIAutomator("text(\"Internet safety course introduction\")").click();
		
	
		
	}
	
	
	@Test(enabled=true,priority=3)
	public void Addbookmarks() throws InterruptedException
	{
		
		
		Thread.sleep(10000);
		
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"Computing\")").click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"Computer science\")").click();
		Thread.sleep(4000);
		driver.findElementByAndroidUIAutomator("text(\"Cryptography\")").click();
		
		Thread.sleep(4000);
		
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
		
		Thread.sleep(4000);
		
		String message=driver.findElement(MobileBy.id("android:id/alertTitle")).getText();
		
		System.out.println(message);
		
		driver.findElement(MobileBy.id("android:id/button2")).click();
		
		
	}
	
	@Test(enabled=true,priority=4)
	public void deletebookmark() throws InterruptedException
	{
		
		driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_bookmarks")).click();
		Thread.sleep(4000);
		
		driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
		
		
		driver.findElement(MobileBy.className("android.widget.ImageView")).click();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Delete\")").click();
		
		Thread.sleep(5000);
		Thread.sleep(6000);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
	
		
		
	}
	
	
}
