import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC49Table {
	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumFireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20719/eng-vs-aus-5th-test-the-ashes-2019");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("div[id='innings_1'] div:nth-child(1)"));
		
		//WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//int row = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0; i<count-3; i++)
		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger = Integer.parseInt(value);
			sum = sum+ valueinteger;
			//System.out.println(driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		//System.out.println(sum);
		
		String Extra = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling:: div")).getText();
		int extraValue = Integer.parseInt(Extra);
		int totalSumValue = sum + extraValue;
		System.out.println(totalSumValue);
		
		//System.out.println(driver.findElement(By.cssSelector(".cb-col.cb-col-8.text-bold.cb-text-black.text-right")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
			
			
	}
}




