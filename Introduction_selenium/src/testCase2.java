import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
		// Create Diver object for FireFox browser
		// creating object for a class(geckoDriver)
		
		// we will strictly implement methods of webDiver
		
		/*class X
		X ref = new X(); */
		// invoke .exe gecko driver
		
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}

	
}
