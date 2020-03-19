import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC19ParentChildXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div/div/div[2]/a")).click();
	}
}
