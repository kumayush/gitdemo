package ayushtesting.AppiumTesting;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragAndDrop extends RepeatedMethods {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement Source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement)Source).getId(),
			    "endX", 672,
			    "endY", 583
			));
		
		String result= driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(result,"Dropped!");
		
		
		
	}
	

}