package ayushtesting.AppiumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ecommerce_testcase2 extends RepeatedMethodsforEcommerceAppTesting {

	@Test
	public void fillform() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("kumar ayush");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
	int prodcount=	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	
	for (int i=0;i<prodcount;i++)
	{
		String prodname=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		if (prodname.equalsIgnoreCase("Jordan 6 Rings"))
		{
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		}
	}
		
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(7));
	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text","Cart"));
	String lastprodname=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	Assert.assertEquals(lastprodname, "Jordan 6 Rings");
	}
	
	
	
	
	

}
