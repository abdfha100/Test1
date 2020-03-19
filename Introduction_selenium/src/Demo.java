import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
		// Create Diver object for chrome browser
		// creating object for a class(chromeDriver)
		
		// we will strictly implement methods of webDiver
		
		/*class X
		X ref = new X(); */
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
	}
}
