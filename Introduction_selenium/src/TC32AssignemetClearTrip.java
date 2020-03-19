import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC32AssignemetClearTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com");

		Thread.sleep(2000L);

		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("2");

		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByIndex(2);

		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		Thread.sleep(2000L);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		driver.switchTo().alert().accept();

	}

}
