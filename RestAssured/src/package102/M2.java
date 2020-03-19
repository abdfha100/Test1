package package102;

//TC02: Validate add and delete by using post and delete methods by XML.
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class M2 {
	
	
	@Test
	public void tc06AddGetDeletePlaceXML() {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given().
			queryParam("key", "qaclick123").
			body("<PlaceAddRequest>\r\n" + 
				"		<location>\r\n" + 
				"		<lat> -38.383494</lat>\r\n" + 
				"		<lng> -33.427362</lng>\r\n" + 
				"		</location>\r\n" + 
				"		<accuracy>50</accuracy>\r\n" + 
				"		<name>Frontline house</name>\r\n" + 
				"		<phone_number>(+91)983 893 3937</phone_number>\r\n" + 
				"		<address>29 side layout cohen 09</address>\r\n" + 
				"		<types>shoe park</types>\r\n" + 
				"		<types>shop</types>\r\n" + 
				"		<website>http://google.com</website>\r\n" + 
				"		<language>French-IN</language>\r\n" + 
				"		</PlaceAddRequest>").
		when().
			post("/maps/api/place/add/xml").
		then().
			assertThat().statusCode(200).
			contentType(ContentType.XML);
		
		
		
	}

}
