
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC47CalendarDynamicdates {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("tlink4")).click();
		driver.findElement(By.xpath("//button[@class='srh']")).click();
		driver.findElement(By.id("travel_date")).click();
		
		WebElement cal = driver.findElement(By.cssSelector(".datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom"));
		while(!cal.getText().contains("April 2020"))
		{
			driver.findElement(By.cssSelector(".datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom th[class='next']")).click();
			
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class,'datepicker-dropdown')] /div[1]"));
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')] /div[1]")).getText());

		int count = dates.size();
		
		for(int i=0;i<count;i++)
		{
			String text = dates.get(i).getText();
			if(text.contentEquals("14"))
			{
				System.out.println(dates.get(i).getText());
				dates.get(i).click();
				break;
			}
		}
	}
}