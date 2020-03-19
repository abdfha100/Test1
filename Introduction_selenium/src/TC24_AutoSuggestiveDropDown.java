import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24_AutoSuggestiveDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("#fromCity")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.cssSelector("#fromCity")).sendKeys("blr");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		//Thread.sleep(2000L);
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000L);
		source.clear();
		source.sendKeys("Mum");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//input[@id='toCity']"));
		destination.click();
		destination.sendKeys("del");
		Thread.sleep(2000L);
		for(int i=1; i<=3; i++)
		{
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
	}
}