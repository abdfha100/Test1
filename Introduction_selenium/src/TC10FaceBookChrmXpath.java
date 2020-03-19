import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10FaceBookChrmXpath {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("shariff@hotmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("passw0rd");
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();

	}

}
