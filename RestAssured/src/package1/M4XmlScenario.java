package package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import file.PayLoad;
import file.Resources;
import file.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class M4XmlScenario {
	PayLoad payload = new PayLoad();
	Properties prop = new Properties();
	Resources resources = new Resources();
	
	@BeforeTest
	public void getData() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}
	
	@Test
	public void AddandDeletePlace() throws IOException
	{
		String postdata = payload.GenerateStringFromResource("F:\\EclipseIde_workSpace\\RestAssured\\PostData.xml");
	
		RestAssured.baseURI = prop.getProperty("HOST");
		
		Response res = given().
				queryParam("key", prop.getProperty("KEY")).
				body(postdata).
		when().
			post(resources.placePostDataXML()).
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.XML).and().
			extract().response();
	
			
		ReusableMethods rm = new ReusableMethods();
		XmlPath xmlnew = rm.rawToXml(res);
		String placeid = xmlnew.get("response.place_id");
		System.out.println(placeid);
		
		given().
			queryParam("key", prop.getProperty("HOST")).
			body("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n" + 
				"<root>\r\n" + 
				"    <place_id>"+placeid+"</place_id>\r\n" + 
				"</root>\r\n" + 
				"").
		when().
			post(resources.placeDeleteDatXML()).
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.XML);
	}

}
