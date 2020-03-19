import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC41Capitaltextpassing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ref=nav_logo");
		
		Actions act = new Actions(driver);
		
		WebElement m1 = driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(m1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		WebElement m2 = driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(m2).build().perform();
		act.moveToElement(m2).contextClick().build().perform();
		
	}

}
