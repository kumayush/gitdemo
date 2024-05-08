package ayushtesting.AppiumTesting;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;



import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Miscellaneous extends RepeatedMethods {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		// to programmatically start and end appium server
		
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		//DEVICE ROTAION
		DeviceRotation rotate=new DeviceRotation(0,0,90);
		driver.rotate(rotate);
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")).click();
		String wifititle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifititle,"WiFi settings");
		
		//copy paste functionality
		driver.setClipboardText("Ayush Wifi");
				
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElement(By.id("android:id/button1")).click();
		
		//BACK/HOME BUUTON FUNCTIONALITY
		KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
		KeyEvent keyEvent1 = new KeyEvent(AndroidKey.BACK);
		driver.pressKey(keyEvent);
		driver.pressKey(keyEvent1);
		
		
		
		
		
		
		//appium supports various locators-Xpath,id,accessibilityId,classname,androidUiAutomator-These are only for android
		//accessibilityId,androidUiAutomator are not for web selenium
		
		
		
	}
	

}
