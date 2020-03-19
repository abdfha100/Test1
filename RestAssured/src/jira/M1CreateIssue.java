package jira;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import file.PayLoad;
import file.Resources;
import file.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class M1CreateIssue {
	Properties prop = new Properties();
	PayLoad pl = new PayLoad();
	Resources resources = new Resources();
	ReusableMethods rm = new ReusableMethods();
	@BeforeTest
	public void getdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}
	@Test
	public void JiraAPI()
	{
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
		System.out.println(id);
	}
}
