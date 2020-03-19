package oAuth2_0AuthorizationCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("shaesmiles@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Telstra99");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		String partialcode =url.split("code")[1];
		String code =partialcode.split("&scope")[0];
		System.out.println(code);
		driver.close();
	}
}
