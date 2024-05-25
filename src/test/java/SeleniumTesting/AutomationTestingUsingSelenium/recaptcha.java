package SeleniumTesting.AutomationTestingUsingSelenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class recaptcha {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ayush\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
            driver.get("https://mcstaging.jaipurliving.com/");

         // Maximize the browser window
            driver.manage().window().maximize();

            // Locate the element to hover over
            WebElement hoverElement = driver.findElement(By.cssSelector("li.level0.nav-1.category-item.first.level-top.ui-menu-item.has-mega-menu"));

            // Initialize Actions class
            Actions actions = new Actions(driver);

            // Perform hover action
            actions.moveToElement(hoverElement).perform();
            //Thread.sleep(20000);

            // Wait for the item to become visible (adjust the selector as needed)
            WebElement itemToClick = driver.findElement(By.xpath("//a[text()='In Stock']"));
            //Actions action1 = new Actions(driver);
            //for opening the link in new tab
            
            //actions.keyDown(Keys.CONTROL).click(itemToClick).keyUp(Keys.CONTROL).build().perform();
            
            //sign in
            driver.findElement(By.cssSelector("a.login-popup-trigger > span")).click();
            Thread.sleep(4000);
            driver.findElement(By.cssSelector("input[title*='Email']")).sendKeys("vinita@jl.com");
            driver.findElement(By.cssSelector("input[title*='Password']")).sendKeys("test@1234");
           System.out.println( driver.findElement(By.tagName("iframe")).getSize().toString());
            
            //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']")));
            //driver.findElement(By.className("recaptcha-checkbox-spinner")).click();
            
            //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));  // Increase the timeout duration

            // Print the page source for debugging
            //System.out.println(driver.getPageSource());

            // Wait for the reCAPTCHA iframe to be present and switch to it
           
           // WebElement recaptchaIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[title='reCAPTCHA']")));
            //driver.switchTo().frame(recaptchaIframe);

            // Wait for the reCAPTCHA checkbox to be clickable
           // WebElement recaptchaCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor")));

            // Scroll the checkbox into view using JavaScript
           // JavascriptExecutor js = (JavascriptExecutor) driver;
           // js.executeScript("arguments[0].scrollIntoView(true);", recaptchaCheckbox);

            // Ensure the checkbox is visible using JavaScript
           // Boolean isCheckboxVisible = (Boolean) js.executeScript(
             //   "return arguments[0].offsetHeight > 0 && arguments[0].offsetWidth > 0;", recaptchaCheckbox);
            //System.out.println("Checkbox is visible: " + isCheckboxVisible);

            //if (isCheckboxVisible) {
                // Click the reCAPTCHA checkbox using JavaScript
               // js.executeScript("arguments[0].click();", recaptchaCheckbox);
            //} else {
                System.out.println("Checkbox is not visible and clickable.");
           // }

            // Switch back to the main content
            driver.switchTo().defaultContent();
            
            // Continue with your test actions...

            // Clean up
            driver.quit();
        }
    }