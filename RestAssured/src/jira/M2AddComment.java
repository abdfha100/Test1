package jira;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import file.PayLoad;
import file.Resources;
import file.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class M2AddComment {
	Properties prop = new Properties();
	@BeforeTest
	public void getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\RestAssured\\env.properties");
		prop.load(fis);
	}
	
	ReusableMethods rm = new ReusableMethods();
	Resources resources = new Resources();
	PayLoad pl = new PayLoad();
	@Test
	public void addComment()
	{
		RestAssured.baseURI = prop.getProperty("JiraHost");
		Response resp =given().
		header("Content-Type", prop.getProperty("ContentType")).
		header("Cookie", "JSESSIONID=" +rm.getSessionKeyJira()).
		body(pl.addCommentIssue()).
		//when().post(resources.addCommentIssueResource()).
		//when().post("/rest/api/2/issue/"+rm.createIssueJira()+"/comment").
		when().post("/rest/api/2/issue/10106/comment").
		then().assertThat().statusCode(201).and().
		contentType(ContentType.JSON).extract().response();
		
		JsonPath jsonnew =rm.rawToJson(resp);
		String id = jsonnew.get("id");
		System.out.println(id);
	}

}
