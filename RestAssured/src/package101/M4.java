package package101;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

//TC04 Validate the post response 

public class M4 {
	
	@Test
	public void tc04() {
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		given().
			queryParam("key","qaclick123").
			body("{\r\n" + 
					"    \"location\":{\r\n" + 
					"        \"lat\" : -38.383496,\r\n" + 
					"        \"lng\" : 33.427363\r\n" + 
					"    },\r\n" + 
					"    \"accuracy\":51,\r\n" + 
					"    \"name\":\"AbdulShariff villa\",\r\n" + 
					"    \"phone_number\":\"(+91) 983 893 1234\",\r\n" + 
					"    \"address\" : \"29, BTM Layout, Motingar 09\",\r\n" + 
					"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
					"    \"website\" : \"http://google.com\",\r\n" + 
					"    \"language\" : \"Malayalam-IND\"\r\n" + 
					"}").
		when().
			post("/maps/api/place/add/json").
		then().
			assertThat().	
			statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK")).and().
			body("scope", equalTo("APP"));
	}
}
