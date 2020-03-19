package pojoSerialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

public class M1 {
	
	public static void main(String[] args) {
		
		M2AddPlace ap = new M2AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("29, BTM Layout, Motingar 09");
		ap.setLanguage("French");
		ap.setName("naza villa");
		ap.setPhone_number("(+91) 983 893 1234");
		ap.setWebsite("http://google.com");
		
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		ap.setTypes(myList);
		
		M3Location loc = new M3Location();
		loc.setLat(38.383496);
		loc.setLng(33.427363);
		ap.setLocation(loc);
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		Response resp= given().
			log().all().
			queryParam("key","qaclick123").
			body(ap).
		when().
			post("maps/api/place/add/json").
		then().
			assertThat().statusCode(200).
		extract().
			response();
		
		String responseString = resp.asString();
		System.out.println(responseString);
	}
}