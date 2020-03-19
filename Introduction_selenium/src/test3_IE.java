import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test3_IE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\SeleniumIE\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		driver.getTitle();
	}
}
