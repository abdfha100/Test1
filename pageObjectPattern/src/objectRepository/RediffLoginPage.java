package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
		public RediffLoginPage(WebDriver driver) {
			this.driver = driver;
		
	}
		By username = By.cssSelector("input[id='login1']");
		By password = By.id("password");
		By go = By.xpath("//input[@name='proceed']");
  		By home = By.xpath("//a[@href='http://www.rediff.com']");
				
		public WebElement EmailId()
		{
			return driver.findElement(username);
		}
		public WebElement Password()
		{
			return driver.findElement(password);
		}
		public WebElement Go()
		{
			return driver.findElement(go);
		}
		public WebElement Home()
		{
			return driver.findElement(home);
		}

}
	
