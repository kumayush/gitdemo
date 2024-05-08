package ayushtesting.AppiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class RepeatedMethodforEcommerceAppTestingOnBrowser {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	@BeforeClass
	public void AppiumConfiguration() throws MalformedURLException, URISyntaxException {
	//// to programmatically start and end appium server	
		 service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ayush\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
				withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();
				
				
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("Pixel_3a_API_34_extension_level_7_x86_64");
				options.setChromedriverExecutable("C:\\Users\\ayush\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				options.setCapability("browserName","chrome");
				
				
				
				
			 driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(),options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				}
	
	public void longpressaction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),"duration",5000));	
	}
	public void SwipeAction(WebElement ele,String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));	
	}
	public double getformattedamount(String amount)
	{
		Double price=Double.parseDouble(amount.substring(1));
		return price;
	}
	
	
	@AfterClass
	public void ClosingTheApplication() {
		driver.quit();
		service.stop();
	}
}


