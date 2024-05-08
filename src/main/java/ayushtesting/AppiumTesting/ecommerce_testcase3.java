package ayushtesting.AppiumTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ecommerce_testcase3 extends RepeatedMethodsforEcommerceAppTesting {

	@Test
	public void fillform() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("kumar ayush");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		//Here we are gain using get (0) because after the first click ,add to cart will be added to cart 
		// so to do the next product search index should be set to 0
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		//the below code is another way to use index in x path to see the same result
		//driver.findElement(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]")).click();	
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text","Cart"));
	List <WebElement> productPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	int count=productPrices.size();
	double totalsum=0;
	for (int i=0;i<count;i++)
	{
		String amountstring=productPrices.get(i).getText();
		double price=Double.parseDouble(amountstring.substring(1));//$160.7 to 160.7 start from index 1 i.e ignore $ symbol
		totalsum=totalsum+price;
	}
	
	String displaysum=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	Double displayformattedsum=getformattedamount(displaysum);
	
	Assert.assertEquals(totalsum,displayformattedsum );
	
	WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
	longpressaction(ele);
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	Thread.sleep(10000);
	}
	
	
	
	
	

}
