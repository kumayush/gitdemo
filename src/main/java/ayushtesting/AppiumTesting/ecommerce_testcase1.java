package ayushtesting.AppiumTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ecommerce_testcase1 extends RepeatedMethodsforEcommerceAppTesting {

	@Test
	public void fillform() throws InterruptedException {
		
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("kumar ayush");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		
		//toast message validation.We are trying to submit the appication without name and verifying the text of the toast message
		//toast messages are handled separately by android.widget.toast class
		String toast=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toast,"Please enter your name");
		
		
		
	}
	
	
	

}
