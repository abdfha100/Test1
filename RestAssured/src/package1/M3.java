package package1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import file.PayLoad;
import file.Resources;
import file.ReusableMethods;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class M3 {
	Resources resources = new Resources();
	PayLoad payload = new PayLoad();
	Properties prop = new Properties();
	@BeforeTest
	public void getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
		prop.getProperty("HOST");
	}
	@Test
	public void AddandDeletePlace()
	{
		//Task-1 Grab the response
		RestAssured.baseURI= prop.getProperty("HOST");
		
		Response res = given().
				queryParam("key", prop.getProperty("KEY")).
				body(payload.getPostData()).
		when().
			post(resources.placePostData()).
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK")).
		extract().response();
		
		//Task-2 Grab the Place-Id from the response
		ReusableMethods rm = new ReusableMethods();
		JsonPath jsonnew= rm.rawToJson(res);
		String placeId = jsonnew.get("place_id");
		System.out.println(placeId);
		
		//Task-3 place this placeId in the delete request
		given().
			queryParam("key", prop.getProperty("KEY")).
			body("{\r\n" + 
				"    \"place_id\":\""+placeId+"\"" + 
				"}").
		when().
			post(resources.placeDeleteData()).
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("status", equalTo("OK"));
	}
}

/*
{\r\n" + 
				"    \"place_id\":\""+placeId+"\"" + 
				"} 
 
 */
 
