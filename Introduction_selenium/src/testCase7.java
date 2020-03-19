import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase7 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //URl in the browser
		driver.findElement(By.id("email")).sendKeys("shariff.abdul@hotmail.com");
		//find the locator email box and enters the text..
		
		driver.findElement(By.name("pass")).sendKeys("passw0rd");
		driver.findElement(By.id("loginbutton")).click();
	}

}
