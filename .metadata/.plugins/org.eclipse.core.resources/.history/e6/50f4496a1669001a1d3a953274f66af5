package package101;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

//TC05 Validate to create add a place and grab the place_id from the response and 
//pass into the delete method to delete the place id. (end to end flow)

public class M5 {
	
	@Test
	public void tc05AddAndDeletePlace() {
		
		String b = "{\r\n" + 
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
				"}\r\n" + 
				"";
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
		//Task-1 grab the response
		Response resp= given().
			queryParam("key", "qaclick123").
			body(b).
		when().
			post("/maps/api/place/add/json").
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK")).
		extract().
			response();
		
		//Task-2 grab the place-id from the response
		String responseString =resp.asString(); //converting Raw jSON response into the String format
		System.out.println(responseString);
		
		JsonPath jsp = new JsonPath(responseString); //converting String format to JSON format by using JsonPath() class
		String placeId= jsp.get("place_id"); //grabbing the place_id from the json response and put into String variable placeId
		System.out.println(placeId);
		
		//Task-3 place this place_id in the delete request..
		given().
			queryParam("key", "qaclick123").
			body("{\r\n" + 
					"    \"place_id\":\""+ placeId+"\"" + 
					"}").
		when().
			post("/maps/api/place/delete/json").
			then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK"));
	}
}
