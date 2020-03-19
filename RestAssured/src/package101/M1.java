package package101;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

//TC01: Validate the status code=200 and content type=JSON 
public class M1 {
	
	public static void main(String[] args) {
		
		//BaseURL or Host
		RestAssured.baseURI = "http://rahulshettyacademy.com";
		
		given().
			param("place_id", "18e1f04f1dfc4f4798ea09c5334797d3").
			param("key","qaclick123").	
		when().
			get("/maps/api/place/get/json").
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON);
		
			 /*header("dafd","dfadfa").
			cookie("afd","dfads").
			body() */
	}
	
	

}
