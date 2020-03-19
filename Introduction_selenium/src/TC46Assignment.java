import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC46Assignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='practice.php']")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='bmw']")).getText());
		
		String input = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText(input);
		
		driver.findElement(By.id("name")).sendKeys(input);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertmsg = driver.switchTo().alert().getText();
		
		if(alertmsg.contains(input))
		{
		System.out.println(alertmsg);
		driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("invalid input");	
		}
	}

}
