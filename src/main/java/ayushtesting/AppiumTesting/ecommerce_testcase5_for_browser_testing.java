package ayushtesting.AppiumTesting;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ecommerce_testcase5_for_browser_testing extends RepeatedMethodforEcommerceAppTestingOnBrowser {

	@Test
	public void browsertest()
	{
		//driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("q")).sendKeys("rahul shetty academy");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement((By.cssSelector("a[routerlink='/products']"))).click();
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)","");
	String text =	driver.findElement(By.cssSelector("a[href$='/angularAppdemo/products/2']")).getText();
	Assert.assertEquals(text, "Appium");	
		
		
		
	}
		
	}
		
		
	
	