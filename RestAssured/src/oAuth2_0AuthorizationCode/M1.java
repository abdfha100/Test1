package oAuth2_0AuthorizationCode;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class M1 extends ExchangeCode {
	
	//M1 m1 = new M1();
	ExchangeCode excd = new ExchangeCode();
	@Test
	public void getCourseOutput() throws InterruptedException
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response = given().log().all().
				param("access_token", excd.exchangeCode()).
		when().
			get("/getCourse.php").asString();
		System.out.println(response);
		
		
	}
}