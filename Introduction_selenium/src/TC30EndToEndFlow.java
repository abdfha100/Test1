	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC30EndToEndFlow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumFireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.cssSelector("*[id='ctl00_mainContent_rbtnl_Trip_0']")).click(); //radio button disabled
		
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // clicking on search button to-from src-dest
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // selecting today's active date
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) //verifying return date is disabled
		{
			Assert.assertTrue(true);
			System.out.println("its disabled");
		}
		else
		{
			Assert.assertFalse(false);
			System.out.println("its enabled");
		}
		
		driver.findElement(By.id("divpaxinfo")).click();  //checking the passengers details
		Thread.sleep(2000L);
		
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByIndex(5);
		
		Thread.sleep(2000L);
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByValue("2");
		
		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByVisibleText("1");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.cssSelector("[id*='friendsandfamily']")).click();  //selecting the checkbox 
		System.out.println(driver.findElement(By.cssSelector("[id*='friendsandfamily']")).isSelected());
		
		Select s = new Select(driver.findElement(By.cssSelector("*[id=\'ctl00_mainContent_DropDownListCurrency\']")));
		s.selectByValue("AED");  //Currency seleciton
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();		
		driver.close();
	}
}
