import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase4 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//hit the URL on the browser
		
		System.out.println(driver.getTitle());
		//validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); 
		//validate if you are landed on the same page
		
		//System.out.println(driver.getPageSource());
		//print page source
	}
}
