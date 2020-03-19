import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC15CustomiseXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("shariff.abdul@gmail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Passw0rd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();		
	}
}
