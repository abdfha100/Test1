package package102;

//TC01: Validate add, get and delete by using post, get and delete methods.
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import file.PayLoad;
import file.Resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class M3 {
	Properties prop = new Properties();
	PayLoad payload = new PayLoad();
	Resources resources= new Resources();
	
	@BeforeTest
	public void getData() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}
	
	@Test
	public void tc03AddGetDeleteplace() {
		
		RestAssured.baseURI = prop.getProperty("HOST");
		
		//Task-1 grab the response
		Response resp = given().
			queryParam("key", prop.getProperty("KEY")).
			body(payload.getPostData()).
		when().
			post(resources.placePostData()).
		then().
			assertThat().
			statusCode(200).and().contentType(ContentType.JSON).
			body("status", equalTo("OK")).
		extract().
			response();
		
		//Task-2 grab the place-id from the response
		String responseString = resp.asString();
		System.out.println(responseString);
		JsonPath json = new JsonPath(responseString);
		String placeId = json.get("place_id");
		System.out.println(placeId);
		
		
		//Task-3 place this place_id in the get-request and validate the response.
		Response getresp = given().
			queryParam("place_id", placeId).
			queryParam("key", prop.getProperty("KEY")).
		when().
			get(resources.placegetData()).
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("location.latitude", equalTo("-38.383496")).and().
			body("location.longitude", equalTo("33.427363")).and().
			body("accuracy", equalTo("51")).and().
			body("name", equalTo("AbdulShariff villa")).and().
			//body("phone_numbe", equalTo("(+91) 983 893 1234")).and().
			body("address", equalTo("29, BTM Layout, Motingar 09")).and().
			body("types", equalTo("shoe park,shop")).and().
			body("website", equalTo("http:google.com")).and().
			body("language", equalTo("Malayalam-IND")).
		extract().
			response();
		String getResponse = getresp.asString();
		System.out.println(getResponse);
		
		
		
		//Task-4 place this place_id in the delete request and validate..
		Response res = given().	
			queryParam("key", prop.getProperty("KEY")).
			body("{\r\n" + 
					"    \"place_id\":\""+ placeId+"\"" + 
					"}").
		when().
			post(resources.placeDeleteData()).
		then().
		 	assertThat().
		 	statusCode(200).and().
		 	contentType(ContentType.JSON).and().
		 	body("status", equalTo("OK")).
		 extract().
		 	response();
		String delres = res.asString();
		System.out.println(delres);	
	}
}
