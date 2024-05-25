package SeleniumTesting.AutomationTestingUsingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.time.Duration;
import java.util.ArrayList;

public class OpenLinksInNewTabs {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ayush\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mcstaging.jaipurliving.com/");

        // List of strings to be used in XPath
        List<String> linkTexts = new ArrayList<>();
        linkTexts.add("Best Sellers");
        linkTexts.add("In Stock");
        linkTexts.add("The Warehouse");
        linkTexts.add("Shop All");
        linkTexts.add("Fine Fibers");
        linkTexts.add("100% Wool");
        linkTexts.add("Wool Blend");
        linkTexts.add("Gray");
        
        // Iterate over the list of strings
        for (String linkText : linkTexts) {
            // Construct the XPath expression
            String xpath = String.format("//a[text()='%s']", linkText);

            // Wait until the element is visible and clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement linkElement = driver.findElement(By.xpath(xpath));
            //WebElement linkElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

            // Get the original window handle
            String originalWindow = driver.getWindowHandle();
            Set<String> existingWindows = driver.getWindowHandles();

            // Use JavaScript to open the link in a new tab
            ((JavascriptExecutor) driver).executeScript("window.open(arguments[0].href);", linkElement);

            // Wait for the new tab to open and switch to it
            String newWindow = waitForNewWindow(driver, existingWindows);
            driver.switchTo().window(newWindow);

            // Perform actions in the new tab
            System.out.println("Title of new tab: " + driver.getTitle());

            // Close the new tab and switch back to the original window
           // driver.close();
            driver.switchTo().window(originalWindow);
        }

        // Close the browser
       // driver.quit();
    }

    private static String waitForNewWindow(WebDriver driver, Set<String> existingWindows) {
        // Wait for the new window to appear
        while (driver.getWindowHandles().size() == existingWindows.size()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Find the new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!existingWindows.contains(windowHandle)) {
                return windowHandle;
            }
        }
        return null;
    }
}
