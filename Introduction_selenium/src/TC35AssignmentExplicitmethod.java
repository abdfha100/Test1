import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC35AssignmentExplicitmethod {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.itgeared.com/");
		
		
		driver.findElement(By.xpath("//a[@href='/articles/1004-preparing-your-active-directory/']")).click();
		
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".ytp-cued-thumbnail-overlay-image"))));
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ytp-cued-thumbnail-overlay-image")));
		System.out.println(driver.findElement(By.cssSelector(".ytp-title-link.yt-uix-sessionlink")).getText());
	}
}
