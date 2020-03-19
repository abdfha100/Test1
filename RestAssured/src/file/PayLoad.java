package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayLoad {
	public String getPostData()
	{
		String b = "{\r\n" + 
				"    \"location\":{\r\n" + 
				"        \"lat\" : -38.383496,\r\n" + 
				"        \"lng\" : 33.427363\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\":51,\r\n" + 
				"    \"name\":\"AbdulShariff villa\",\r\n" + 
				"    \"phone_number\":\"(+91) 983 893 1234\",\r\n" + 
				"    \"address\" : \"29, BTM Layout, Motingar 09\",\r\n" + 
				"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
				"    \"website\" : \"http:google.com\",\r\n" + 
				"    \"language\" : \"Malayalam-IND\"\r\n" + 
				"}\r\n" + 
				"";
		return b;
	}
	
	public String getPostDataCreateAddress()
	{
		String b= "{\r\n" + 
				"    \"location\":{\r\n" + 
				"        \"lat\" : -38.383123,\r\n" + 
				"        \"lng\" : 33.277363\r\n" + 
				"    },\r\n" +
				"    \"accuracy\":51,\r\n" + 
				"    \"name\":\"ZaeemMuhammed Rivervilla\",\r\n" + 
				"    \"phone_number\":\"(+91) 933 893 4321\",\r\n" + 
				"    \"address\" : \"401, HSR Layout, Bangalore 09\",\r\n" + 
				"    \"types\": [\"she park\",\"shop\"],\r\n" + 
				"    \"website\" : \"http://google.com\",\r\n" + 
				"    \"language\" : \"Kannada-IND\"\r\n" + 
				"}";
		return b;
	}
	
	public String GenerateStringFromResource(String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));	
	}
	
	public String addBook(String isbn, String aisle)
	{
		String payload = "{\r\n" + 
				"\"name\":\"Learn selenium Automation with Groovy\",\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\"aisle\":\""+aisle+"\",\r\n" + 
				"\"author\":\"Fahad1\"\r\n" + 
				"}";
		return payload;
	}
	
	public String generateJiraCookie()
	{
		String s = "{ \"username\": \"admin\", \"password\": \"Passw0rd\" }";
		return s;
	}
	
	public String createIssueJira()
	{
		String s = "{\r\n" + 
				"  \"fields\": {\r\n" + 
				"    \"project\": \r\n" + 
				"    {\r\n" + 
				"      \"key\": \"RES\"\r\n" + 
				"    },\r\n" + 
				"    \"summary\": \"Issue from REST-API \",\r\n" + 
				"    \"description\": \"Creating issue from rest-API\",\r\n" + 
				"    \"issuetype\": {\r\n" + 
				"      \"name\": \"Bug\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		return s;
	}
	
	public String addCommentIssue()
	{
		String s= "{\r\n" + 
				" \"body\": \"Inserting 3rd comment from automation code\",\r\n" + 
				"\"visibility\": {\r\n" + 
				"    \"type\": \"role\",\r\n" + 
				"    \"value\": \"Administrators\"\r\n" + 
				"  }\r\n" + 
				"}";
		return s;
	}
	
	
	public String updateCommentIssue()
	{
		String s= "{\r\n" + 
				" \"body\": \" Updated the new comments for the existing bug\",\r\n" + 
				"\"visibility\": {\r\n" + 
				"    \"type\": \"role\",\r\n" + 
				"    \"value\": \"Administrators\"\r\n" + 
				"  }\r\n" + 
				"}";
		return s;
	}
	
}
