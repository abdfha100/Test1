import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_CapErrorMsg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.cssSelector("input#username.input.r4.wide.mb16.mt8.username")).sendKeys("Ashariff");
		driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("passw0rd");
		driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}
}
