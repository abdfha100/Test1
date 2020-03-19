import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC11SalesForceFireFoxXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Ashariff");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("passw0rd");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	}

}
