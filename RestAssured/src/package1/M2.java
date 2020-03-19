package package1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import file.PayLoad;
import file.Resources;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class M2 {
	Properties prop = new Properties();
	Resources resources = new Resources();
	PayLoad payload = new PayLoad();
	@BeforeTest
	public void getData() throws IOException
	{
		FileInputStream fis = new  FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}
	@Test
	public void postData()
	{
		RestAssured.baseURI= prop.getProperty("HOST");
		given().
		queryParam("key", prop.getProperty("KEY")).
		body(payload.getPostDataCreateAddress()).
		when().
		post(resources.placePostData()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().and().
		body("status", equalTo("OK"));
		//create a place and delete that
	}
}
