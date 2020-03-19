package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepository.RediffLoginPage;

public class LoginApplication {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage loginPage = new RediffLoginPage(driver);
		
		loginPage.EmailId().sendKeys("nusrinShariff");
		loginPage.Password().sendKeys("passw0rd");
		loginPage.Go().click();
		loginPage.Home().click();
	}
}
