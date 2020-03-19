package package1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.*;
import file.Resources;
import static io.restassured.RestAssured.given;

public class M1 {
	Properties prop = new Properties();
	Resources resources = new Resources();
	
	@BeforeTest
	public void getData() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}
	@Test
	public void Test() {
		//Base URL or host
		RestAssured.baseURI= prop.getProperty("HOST1");
		
		given().
			param("location", "-33.8670522,151.1957362").
			param("radius","500").
			param("key", prop.getProperty("KEY1")).log().all().
			when().get(resources.placegetData()).
			then().assertThat().statusCode(200).and().
			contentType(ContentType.JSON).and().
			body("results[0].name", equalTo("Sydney")).and().
			body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
			header("Server", "scaffolding on HTTPServer2");
		
		
		
			//body("results[0].geometry.location.lat", equalTo("-33.8688197"));
		//validation of status code of the response
		//content type
		//Body
		//header responses	
	}
}
