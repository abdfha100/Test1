package package1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.*;
import static org.hamcrest.Matchers.equalTo;

import file.Resources;
import file.ReusableMethods;

import static io.restassured.RestAssured.given;

public class M5JsonRespValidation {
	Properties prop = new Properties();

	@BeforeTest
	public void getData() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}

	Resources resources = new Resources();
	ReusableMethods rm = new ReusableMethods();
	@Test
	public void Test() {
		RestAssured.baseURI = prop.getProperty("HOST1");
		
		Response resp = given().
			param("location", "-33.8670522,151.1957362").
			param("radius", "500").
			param("key", prop.getProperty("KEY1")).
			log().all().
		when().
			get(resources.placegetData()).
		then().
			assertThat().
			statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("results[0].name", equalTo("Sydney")).
			log().all().
		extract().
			response();
		
		JsonPath jsonresp= rm.rawToJson(resp);
		
		int count = jsonresp.get("results.size()");
		for(int i=0; i<count; i++)
		{
			String name = jsonresp.get("results["+i+"].name");
			System.out.println(name);
		}
		//System.out.println(count);
	}
}
