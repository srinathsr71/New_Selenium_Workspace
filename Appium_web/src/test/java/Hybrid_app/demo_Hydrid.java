package Hybrid_app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class demo_Hydrid {
	
	AndroidDriver<AndroidElement> driver;	
	@BeforeTest	
		public void details() throws MalformedURLException{
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
			//dc.setCapability("autoWebview", true);
			dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "H://Downloads//chromedriver.exe");
			dc.setCapability("appium:chromeOptions",ImmutableMap.of("w3c",false));
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
			
		}	
	
	
	@Test(enabled=false)
	public void test1() throws InterruptedException {
		driver.findElement(MobileBy.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toast=driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
		System.out.println(toast);
		
		
	}
	@Test(enabled=true)
	public void positiveTesting() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		Thread.sleep(7000);
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(7000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(6000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(6000);
		String s1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		//first remove the character using substring
		s1=s1.substring(1);
		//convert the string into Double using parseDouble
		Double d=Double.parseDouble(s1);
		System.out.println(d);
		Thread.sleep(6000);
		String s2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		s2=s2.substring(1);
		Double de=Double.parseDouble(s2);
		System.out.println(s2);
		Double Totalprice=d+de;
		System.out.println(Totalprice);
		Thread.sleep(6000);
		
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		Thread.sleep(6000);
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		//driver.context("WEBVIEW_1");
		//driver.context("WEBVIEW");
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(10000);
//		
		
	}

}










