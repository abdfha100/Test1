import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase5 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//hit the URL on the browser
		
		System.out.println(driver.getTitle());
		//validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); 
		//validate if you are landed on the same page
		
		//System.out.println(driver.getPageSource());
		//print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		//navigate back to google..
		
		//driver.navigate().forward();
		driver.close(); // closes current browser
		//driver.quit(); // closes all the browser which is opened by selenium
	}
}
