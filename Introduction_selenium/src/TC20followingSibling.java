import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC20followingSibling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/index.php");
		
		driver.findElement(By.xpath("//a[@href='interview.php']")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
		
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
	}
}
