import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC16CustomiseCSS_SalesForce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		
		//tagName[@attribute='value'] 
		
		//tagName[attribute='value']- CSS
		driver.findElement(By.cssSelector("*[type='email']")).sendKeys("nusrin");
		driver.findElement(By.cssSelector("*[id='password']")).sendKeys("Passw0rd");
		driver.findElement(By.cssSelector("*[id='Login']")).click();	
	}
}
