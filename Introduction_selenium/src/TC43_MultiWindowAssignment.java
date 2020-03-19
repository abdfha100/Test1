import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC43_MultiWindowAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();

		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);
		
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.titleContains("New Window"));
		System.out.println(driver.getTitle());

		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}
}
