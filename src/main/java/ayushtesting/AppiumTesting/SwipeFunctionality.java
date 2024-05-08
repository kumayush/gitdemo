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

public class SwipeFunctionality extends RepeatedMethods {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
		WebElement image=driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"true");
		
		//swipe
		SwipeAction( image,"left");
		
		
		
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"false");
		
		
		
		
	}
	

}