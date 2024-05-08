package ayushtesting.AppiumTesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollFunctionality extends RepeatedMethods {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		// to programmatically start and end appium server
		
		//AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ayush\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		//withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//There are 2 ways to do scrolling 1 is using UiScrollable class of google .This works well when we know till where we want to scroll
		//We can simply type the text till where we want to scroll.
		//second method is using the can scroll more functionality.This is more specific we are sure till where we want to do the scroll
		//method 1.
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		
		//Method 2
		// Java
		boolean canScrollMore;
		do
		{	
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
		}
		while (canScrollMore);
		
		
		
	}
	

}