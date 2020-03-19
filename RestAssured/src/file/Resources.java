package file;

import io.restassured.path.json.JsonPath;
import jira.M1CreateIssue;

public class Resources {
	public String placePostData()
	{
		String res = "/maps/api/place/add/json";
		return res;
	}
	public String placeDeleteData()
	{
		String res = "/maps/api/place/delete/json";
		return res;
	}
	public String placegetData()
	{
		String res = "/maps/api/place/get/json";
		return res;
	}
	public String placePostDataXML()
	{
		String res = "/maps/api/place/add/xml";
		return res;	
	}
	public String placeDeleteDatXML()
	{
		String res = "maps/api/place/delete/xml";
		return res;
		
	}
	public String getJiraCookie()
	{
		String res = "/rest/auth/1/session";
		return res;
	}
	public String createJiraIssueResource()
	{
		String res = "/rest/api/2/issue";
		return res;
	}
	public String addCommentIssueResource()
	{
		ReusableMethods rm = new ReusableMethods();
		String id = rm.createIssueJira();
		String res = "/rest/api/2/issue/"+rm.createIssueJira()+"/comment";
		return res;				
	}
}


