package specBuilder;

// Validate the Request SpecBuilder functionality..
 
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoSerialization.M2AddPlace;
import pojoSerialization.M3Location;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.List;

public class M1SpecBuilder {
	
	public static void main(String[] args) {
		
		M2AddPlace ap = new M2AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("29, BTM Layout, Motingar 09");
		ap.setLanguage("French");
		ap.setName("naza villa");
		ap.setPhone_number("(+91) 983 893 1234");
		ap.setWebsite("http://google.com");
		
		RequestSpecification req= new RequestSpecBuilder().
				setBaseUri("https://rahulshettyacademy.com").
				addQueryParam("key", "qaclick123").
				setContentType(ContentType.JSON).build();
		
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		ap.setTypes(myList);
		
		M3Location loc = new M3Location();
		loc.setLat(38.383496);
		loc.setLng(33.427363);
		ap.setLocation(loc);
		
		RequestSpecification res = given().spec(req).
			log().all().
			body(ap);
		
		 Response response = res.when().
			post("maps/api/place/add/json").
		then().
			assertThat().statusCode(200).
		extract().
			response();
		
		String responseString = response.asString();
		System.out.println(responseString);
		
		// Need to complete the ResponseSpecBuilder scenario...
	}
}