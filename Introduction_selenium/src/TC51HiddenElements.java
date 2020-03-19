import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// enter the letter "beng" 
// verify if airport option is displayed in the suggestive box
public class TC51HiddenElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("ben");
		Thread.sleep(200L);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		//WebDriverWait wt = new WebDriverWait(driver, 20);
		//wt.until(ExpectedConditions.titleContains("KSRTC"));
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).getText();
		
		/*
		 Javascript DOM can extract hiddden elements
		 because selenium cannot identify hidden elements (Ajax implementation)
		 investigate the properties of object if it have any hidden text 
		 */
		
		
		//JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 String script = "return document.getElementById(\"fromPlaceName\").value;";
		 String text =(String) js.executeScript(script);
		 //System.out.println(text);
		 int i=0;
		
		 while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		 {
			 i++;
			 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			 text =(String) js.executeScript(script);
			 System.out.println(text);
			 if(i>10)
			 {
				 break;
			 }
		 }
		 
		 if(i >10)
		 {
			 System.out.println("Elements not found");
		 }
		 else
		 {
			 System.out.println("Elements found");
	
		 }	
	}
}
