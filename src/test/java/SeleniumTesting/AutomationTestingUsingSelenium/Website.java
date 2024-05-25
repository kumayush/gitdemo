package SeleniumTesting.AutomationTestingUsingSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Website {

	

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
            List<WebElement> hrefElements = driver.findElements(By.xpath("//*[@href]"));
            for (WebElement element : hrefElements) 
            {
                System.out.println(element.getText());
            }
	}
}
           /* String [] linkstoclick = {"Hand Knotted","Shop All","Best Sellers"};
            for (String clickable : linkstoclick)
            {
            	String originalWindow = driver.getWindowHandle();
                Set<String> existingWindows = driver.getWindowHandles();
                WebElement itemToClick = driver.findElement(By.xpath("//a[text()=linkstoclick"));
                //actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
                String newWindow = waitForNewWindow(driver, existingWindows);
                driver.switchTo().window(newWindow);

                // Perform actions in the new tab
                System.out.println("Title of new tab: " + driver.getTitle());
            }    
            }
            
            private static String waitForNewWindow(WebDriver driver, Set<String> existingWindows) 
            {
                // Wait for the new window to appear
                while (driver.getWindowHandles().size() == existingWindows.size())
                {
                    try 
                    {
                        Thread.sleep(10000);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
                for (String windowHandle : driver.getWindowHandles()) 
                {
                    if (!existingWindows.contains(windowHandle)) 
                    {
                        return windowHandle;
                    }
                }
                
                return null;
}
	}*/

            //Thread.sleep(20000);
            //WebElement itemToClick = driver.findElement(By.xpath("//a[text()='In Stock']"));
            //WebElement itemToclick2=driver.findElement(By.xpath("//a[text()='Best Sellers']"));
            //actions.keyDown(Keys.CONTROL).click(itemToClick).keyUp(Keys.CONTROL).build().perform();
            //actions.keyDown(Keys.CONTROL).click(itemToclick2).keyUp(Keys.CONTROL).build().perform();
            
                
            

            
    

            
            //for opening the link in new tab
            
            //actions.keyDown(Keys.CONTROL).click(itemToClick).keyUp(Keys.CONTROL).build().perform();
            
            //sign in
            //driver.findElement(By.cssSelector("a.login-popup-trigger > span")).click();
            //Thread.sleep(4000);
           // driver.findElement(By.cssSelector("input[title*='Email']")).sendKeys("vinita@jl.com");
            //driver.findElement(By.cssSelector("input[title*='Password']")).sendKeys("test@1234");
                
            
           


