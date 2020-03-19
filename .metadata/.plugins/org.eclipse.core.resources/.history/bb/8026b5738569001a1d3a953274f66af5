package package101;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

//TC02 validate all the get response content the fields
//Note this test case has changed with testNG format

public class M2 {
	
	@Test
	public void tc02() {
		RestAssured.baseURI ="http://rahulshettyacademy.com";    
		
		given().
			param("place_id", "18e1f04f1dfc4f4798ea09c5334797d3").
			param("key", "qaclick123").
		when().
			get("/maps/api/place/get/json").
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("location.latitude", equalTo("-38.383496")).and().
			body("location.longitude", equalTo("33.427363")).and().
			body("accuracy", equalTo("51")).and().
			body("name", equalTo("AbdulShariff villa")).and().
			body("phone_number", equalTo("(+91) 983 893 1234")).and().
			body("address", equalTo("29, BTM Layout, Motingar 09")).and().
			body("types", equalTo("shoe park,shop")).and().
			body("website", equalTo("http://google.com")).and().
			body("language", equalTo("Malayalam-IND"));
	}
}