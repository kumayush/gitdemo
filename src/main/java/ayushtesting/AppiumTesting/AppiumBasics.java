package ayushtesting.AppiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends RepeatedMethods {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		// to programmatically start and end appium server
		
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='WiFi settings']")).click();
		String wifititle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifititle,"WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Ayush Wifi");
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
		
		//appium supports various locators-Xpath,id,accessibilityId,classname,androidUiAutomator-These are only for android
		//accessibilityId,androidUiAutomator are not for web selenium
		
		
		
	}
	

}
