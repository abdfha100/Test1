import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC36Fluentwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/dynamic_loading']")).click();
		driver.findElement(By.xpath("//a[@href='/dynamic_loading/1']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("#start")).click();
		
		System.out.println(driver.findElement(By.id("finish")).getText());
		
	}
}
