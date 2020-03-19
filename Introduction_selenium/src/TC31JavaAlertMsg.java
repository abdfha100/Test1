import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC31JavaAlertMsg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///F:/JavaScript/practise/Controller.html");
		
		driver.findElement(By.cssSelector("[name='skillsController']")).click();
		Thread.sleep(3000L);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[name='skillsController']")).click();
		Thread.sleep(3000L);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
