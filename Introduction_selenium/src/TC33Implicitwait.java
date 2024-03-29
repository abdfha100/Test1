import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC33Implicitwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.via.com/hotels");
		
		driver.findElement(By.id("destination")).sendKeys("nyc");
		Thread.sleep(2000L);
		driver.findElement(By.id("destination")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("destination")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='search-hotel']")).click();
		
		driver.findElement(By.cssSelector(".bookBtn.js-bookRoom.via-processed")).click();
		
	}

}
