import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC45LinksCount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		WebElement co1driver= footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(co1driver.findElements(By.tagName("a")).size());
		
		for(int i=1; i<co1driver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink =Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			co1driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
		}
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}



//video-83

/*
1. Give the count of links on the page
2. count the no of links on the footer page. 
3. count the no of links in the 1st cloumen of the footer page
4. click on each link in the col-1 and check if pages are opening?

 */
