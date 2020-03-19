package oAuth2_0AuthorizationCode;

import static io.restassured.RestAssured.given;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import file.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExchangeCode {
	
	public static String getCode() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromeDriver\\LatestDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("shaesmiles@gmail.com");
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Telstra99");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(10000);
		String url = driver.getCurrentUrl();
		String partialcode = url.split("code=")[1];
		String code = partialcode.split("&scope")[0];
		System.out.println(code);
		driver.close();
		return code;
	}
	ReusableMethods rm = new ReusableMethods();
	
	@Test
	public String exchangeCode() throws InterruptedException
	{
		RestAssured.baseURI="https://www.googleapis.com";
		Response resp = given().urlEncodingEnabled(false).log().all().
							param("code", ExchangeCode.getCode()).
							param("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
							param("client_secret", "erZOWM9g3UtwNRj340YYaK_W").
							param("redirect_uri", "https://rahulshettyacademy.com/getCourse.php").
							param("grant_type", "authorization_code").
		when().
			post("/oauth2/v4/token").
		then().
			assertThat().statusCode(200).
		extract().
			response();
		
		JsonPath jsonnew = rm.rawToJson(resp);
		String access_token =jsonnew.get("access_token");
		System.out.println(access_token);
		return access_token;
	}
}