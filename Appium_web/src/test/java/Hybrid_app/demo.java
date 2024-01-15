package Hybrid_app;

import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class demo {
	
	AndroidDriver<AndroidElement> driver;	
	@BeforeTest	
		public void details() throws MalformedURLException{
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
		}	
	
	
	
	
	@Test(enabled=true)
	public void positive() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
	
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\").scrollIntoView(new UiSelector().text(\"Jordan Lift Off\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\").instance(0))"));
		driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
		int count=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/rvProductList")).size();
				//System.out.println(count);
		for(int i=0;i<count;i++) {
			String pn=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(pn);
			if(pn.equalsIgnoreCase("Jordan Lift Off")) {
				System.out.println(pn);
				driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		}
		
//		String gt=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").getText();
//		System.out.println(gt);
		//System.out.println(productname);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		//driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		String s5=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productPrice")).getText();
		s5=s5.substring(1);
		Double u=Double.parseDouble(s5);
		System.out.println(u);
		Thread.sleep(5000);
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		
//	
	}
	
}









