package package102;

// TC01: Validate add and delete by using post and delete methods.
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import file.PayLoad;
import file.Resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class M1 {
	Properties prop = new Properties();
	Resources resources = new Resources();
	PayLoad payload = new PayLoad();
	
	
	@BeforeTest
	public void getData() throws IOException {
		
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
		prop.getProperty("HOST");
	}
	
	@Test
	public void tc05AddAndDeletePlace() {
		
		RestAssured.baseURI = prop.getProperty("HOST"); //add Host value from env.properties file
		
		//Task-1 grab the response
		Response resp= given().
			queryParam("key", prop.getProperty("KEY")). //add KEY value from env.properties file
			body(payload.getPostData()).  //added post request body from PayLoad class with method getPostData()  
		when().
			post(resources.placePostData()). // added resource details from the Resource class with method placePostData()
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK")).
		extract().response();
		
		//Task-2 grab the place-id from the response
		String responseString =resp.asString(); //converting Raw jSON response into the String format
		System.out.println(responseString);
		
		//converting String format to JSON format by using JsonPath() class
		JsonPath jsp = new JsonPath(responseString); 
		//grabbing the place_id from the jSON response and put into String variable placeId
		String placeId= jsp.get("place_id"); 
		System.out.println(placeId);
		
		//Task-3 place this place_id in the delete request..
		given().
			queryParam("key", prop.getProperty("Host")). //add Host value from env.properties file
			body("{\r\n" + 
					"    \"place_id\":\""+ placeId+"\"" + 
					"}").
		when().
			post(resources.placeDeleteData()). // added resource details from the Resource class with method placeDeleteData()
			then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK"));
	}
}
