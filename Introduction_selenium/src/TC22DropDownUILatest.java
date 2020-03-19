import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC22DropDownUILatest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		try {
			Thread.sleep(2000L);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			for (int i = 1; i < 5; i++) {
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			for (int i = 1; i < 3; i++) {
				driver.findElement(By.id("hrefIncChd")).click();
			}
			for (int i = 1; i < 2; i++) {
				driver.findElement(By.id("hrefIncInf")).click();
			}
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

/*
 
while (true)
{

}
 
int i= 1;

while(i<5)
{
driver.findElement(By.id("hrefIncAdt")).click();
i++;
}
  
  
  
  
  
  */

