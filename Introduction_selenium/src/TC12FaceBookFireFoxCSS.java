import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC12FaceBookFireFoxCSS {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("shariff@hotmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Passw0rd");
		driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).click();
		
	}
}
