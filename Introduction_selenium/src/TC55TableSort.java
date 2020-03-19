import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC55TableSort {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstColList =driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		sortColumn(firstColList, "asc");
	}

	public static void sortColumn(List<WebElement> firstColList, String order) {
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0; i<firstColList.size(); i++)
		{
			originalList.add((firstColList.get(i).getText()));
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		for(int i=0; i<originalList.size(); i++)
		{
			copiedList.add(originalList.get(i));
		}
		System.out.println("*********************************");
		
		Collections.sort(copiedList);
		if(order.equalsIgnoreCase("desc"))
		{
			Collections.reverse(copiedList);
		}
		
		for(String s: copiedList)
		{
			System.out.println("SortedOne: " + s);
		}
		System.out.println("=======================================");
		for(String o: originalList)
		{
			System.out.println("Original :" + o);
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
		
	}
}
