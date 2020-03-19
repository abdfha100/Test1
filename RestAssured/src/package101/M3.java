package package101;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

//TC03 validate the header content of the request
public class M3 {
	
	@Test
	public void tc03() {
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		given().
			queryParam("place_id", "18e1f04f1dfc4f4798ea09c5334797d3").
			queryParam("key", "qaclick123").
		when().
			get("/maps/api/place/get/json").
		then().
			assertThat().
			statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("language", equalTo("Malayalam-IND")).and().
			header("Server", "Apache/2.4.18 (Ubuntu)").and().
			header("Content-Type", "application/json;charset=UTF-8");
	}
}
