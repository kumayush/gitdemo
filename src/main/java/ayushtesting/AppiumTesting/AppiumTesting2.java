package ayushtesting.AppiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumTesting2 {
	@Test
	public void appiumtest() throws MalformedURLException, URISyntaxException
	{
		
		// to programmatically start and end appium server
		
		//AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ayush\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		//withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel_3a_API_34_extension_level_7_x86_64");
		options.setApp("C:\\Users\\ayush\\Downloads\\Appium course\\APKFiles\\resources\\ApiDemos-debug.apk");
		
		
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(),options);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.quit();
		//service.stop();
		
		
		//appium supports various locators-Xpath,id,accessibilityId,classname,androidUiAutomator-These are only for android
		//accessibilityId,androidUiAutomator are not for web selenium
		
		
		
	}
	

}
