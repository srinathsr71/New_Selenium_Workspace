package CapabilitiesPack;


import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class test_case extends Capabilities {
	
	@BeforeTest
	public void KillAllProcesses() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(10000);
		//System.out.println("hai");
		
	}
	@Test
	public void tc1() throws IOException, InterruptedException {
		//System.out.println("hello");
		service = startServer();
		System.out.println("hello");
		Capabilities.startEmulator();
		Thread.sleep(9000);
		AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName,chromeexcutable);
		System.out.println("welcome");
		//Thread.sleep(20000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))").click();
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("srinath");
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(7000);
		String s1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		Thread.sleep(6000);
		//first remove the character using substring
		s1=s1.substring(1);
		//convert the string into Double using parseDouble
		Double d=Double.parseDouble(s1);
		System.out.println(d);
		Thread.sleep(7000);
		String s2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		Thread.sleep(6000);
		s2=s2.substring(1);
		Double de=Double.parseDouble(s2);
		System.out.println(s2);
		Double Totalprice=d+de;
		System.out.println(Totalprice);
		Thread.sleep(6000);
			
		//String fr=driver.findElementByAndroidUIAutomator("text(\"$ 280.97\")").getText();
		//String s=fr.getText();
		String fr=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		//String s=fr.getText();
		fr=fr.substring(1);
		Double w=Double.parseDouble(fr);
		System.out.println(w);
		if(Totalprice.equals(w)) {
			System.out.println("price matching");
		}
		else {
			System.out.println("price not matching");
		}
		driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.className("android.widget.Button")).click();
		service.stop();
		
		
}
}