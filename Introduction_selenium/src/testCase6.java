import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase6 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //URl in the browser
		driver.findElement(By.id("email")).sendKeys("this is first selenium code");
		//find the locator email box and enters the text..
	}
}
