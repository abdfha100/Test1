import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TC26Assertions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for(int i=1; i<4; i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
	
	}
}
