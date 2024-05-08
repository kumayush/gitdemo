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


import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class IosTestingRepeatedMethods {
	public AppiumDriverLocalService service;
	public IOSDriver driver;
	@BeforeClass
	public void AppiumConfiguration() throws MalformedURLException, URISyntaxException {
	//// to programmatically start and end appium server	
		 service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ayush\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
				withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();
				
				
				XCUITestOptions options = new XCUITestOptions();
				options.setDeviceName("Device name");
				options.setApp("location of app");
				options.setPlatformVersion("");
				//appium in ios testing doest not directly test tge ios apps as compared to android
				//it will first install the webdriver agent
				//thats why we are using wda timeout
				options.setWdaLaunchTimeout(Duration.ofSeconds(20));
				
				
				
			 driver = new IOSDriver(new URI("http://127.0.0.1:4723/").toURL(),options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				}
	
	
	
	@AfterClass
	public void ClosingTheApplication() {
		driver.quit();
		service.stop();
	}
}


