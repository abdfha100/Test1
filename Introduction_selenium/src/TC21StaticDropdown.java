import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC21StaticDropdown {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.spicejet.com/");

		Select s = new Select(driver.findElement(By.cssSelector("*[id=\'ctl00_mainContent_DropDownListCurrency\']")));
		s.selectByValue("USD");
		s.selectByIndex(2);
		s.selectByVisibleText("USD");
	}
}
