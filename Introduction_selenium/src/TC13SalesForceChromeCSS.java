import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13SalesForceChromeCSS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("Ashariff");
		driver.findElement(By.cssSelector("input#password")).sendKeys("passw0rd");
		driver.findElement(By.cssSelector("input#Login")).click();
	}
}




