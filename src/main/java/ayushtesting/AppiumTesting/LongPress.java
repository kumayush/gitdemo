package ayushtesting.AppiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LongPress extends RepeatedMethods {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		// to programmatically start and end appium server
		
		//AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ayush\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		//withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longpressaction(ele);
		//log press gesture already included in the repeated methods
		//((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    //"elementId", ((RemoteWebElement) ele).getId(),"duration",5000));
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		
		//service.stop();
		
		
		//appium supports various locators-Xpath,id,accessibilityId,classname,androidUiAutomator-These are only for android
		//accessibilityId,androidUiAutomator are not for web selenium
		
		
		
	}
	

}

