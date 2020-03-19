package parameterize;

import org.testng.annotations.Test;

import file.PayLoad;
import file.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.IOException;

public class StaticJson {
	PayLoad pl = new PayLoad();
	@Test
	public void addBook() throws IOException
	{
		RestAssured.baseURI="http://216.10.245.166";
		Response resp = given().
				header("Content-Type", "application/json").
				body(pl.GenerateStringFromResource("F:\\UdemyREST_API\\StaticJsonInputData\\jsonInputdata.json")).
		when().
			post("/Library/Addbook.php").
		then().
			assertThat().statusCode(200).
			contentType(ContentType.JSON).
		extract().
			response();
		
		ReusableMethods rm= new ReusableMethods();
		JsonPath jsonnew = rm.rawToJson(resp);
		String id = jsonnew.get("ID");
		System.out.println(id);	
	}
	
	//add the get method byID and name and the delete method
}
