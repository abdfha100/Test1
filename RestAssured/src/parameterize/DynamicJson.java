package parameterize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import file.PayLoad;
import file.ReusableMethods;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DynamicJson {
	
	PayLoad pl = new PayLoad();
	
	@Test(dataProvider="BooksData")
	public void addBook(String isbn, String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		
		Response resp =given().
			header("Content-Type", "application/json").
			body(pl.addBook(isbn, aisle)).
		when().
			post("/Library/Addbook.php").
		then().
			assertThat().statusCode(200).and().
			contentType(ContentType.JSON).
		extract().
			response();
		
		ReusableMethods rm = new ReusableMethods();
		JsonPath jsonnew = rm.rawToJson(resp);
		String id = jsonnew.get("ID");
		System.out.println(id);	
	}
	
	//array= collection of elements
	//multidimensional array =collections of arrays. 
	@DataProvider(name ="BooksData")
	public Object[][] generateData()
	{
		Object[][] elements = new Object[][] {{"qwsdr", "346475"}, {"aqqad", "56114"}, {"dgdsdda", "1134246"}};
		return elements;
	}
	
	//add the delete scenario too with data gen to deleler the books..
	////add the get method byID and name and the delete method
}