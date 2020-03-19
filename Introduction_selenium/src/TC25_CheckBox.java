import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC25_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		// System.out.println(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());

		driver.findElement(By.cssSelector("[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		Thread.sleep(2000L);

		driver.findElement(By.cssSelector("[id*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("[id*='StudentDiscount']")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}
}
