import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC27Exercise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.cssSelector("*[id='checkBoxOption1']")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.cssSelector("*[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("*[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("*[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}
