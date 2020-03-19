package file;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public XmlPath  rawToXml(Response r)
	{
		String response = r.asString();
		XmlPath xmlnew= new XmlPath(response);
		return xmlnew;
	}
	
	public JsonPath  rawToJson(Response r)
	{
		String response = r.asString();
		JsonPath jsonnew= new JsonPath(response);
		return jsonnew;
	}
	

	public String getSessionKeyJira()
	{
		PayLoad pl = new PayLoad();
		Resources resources = new Resources();
		ReusableMethods rm = new ReusableMethods();
		
		RestAssured.baseURI = "http://localhost:8181";
		Response resp = given().header("Content-Type", "application/json").
		body(pl.generateJiraCookie()).
		when().
		post(resources.getJiraCookie()).
		then().
		assertThat().statusCode(200).and().and().
		contentType(ContentType.JSON).
		extract().response();
		
		JsonPath jsonnew = rm.rawToJson(resp);
		String name = jsonnew.get("session.name");
		String value = jsonnew.get("session.value");
		//System.out.println(name + ": " + value );
		return value;
	}
	
	public String createIssueJira()
	{
		Properties prop = new Properties();
		PayLoad pl = new PayLoad();
		Resources resources = new Resources();
		ReusableMethods rm = new ReusableMethods();
		
		RestAssured.baseURI = prop.getProperty("JiraHost");
		Response resp = given().header("Content-Type", prop.getProperty("ContentType")).
		header("Cookie", "JSESSIONID=" +rm.getSessionKeyJira()).
				
		body(pl.createIssueJira()).
		when().
		post(resources.createJiraIssueResource()).
		then().
		assertThat().statusCode(201).and().and().
		contentType(ContentType.JSON).
		extract().response();
		
		JsonPath jsonnew = rm.rawToJson(resp);
		String id = jsonnew.get("id");
		return id;
	}
}
