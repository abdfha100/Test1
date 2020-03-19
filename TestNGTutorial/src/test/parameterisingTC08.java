package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterisingTC08 {
	@Parameters({"APIkey/userName"})
	@Test
	public void getKeytrol(String keyUsrName)
	{
		System.out.println("getKeytrol");
		System.out.println(keyUsrName);
	}
	@Parameters({"URL2"})
	@Test
	public void syncKeytrol(String urlname)
	{
		System.out.println("syncKeytrol");
		System.out.println(urlname);
	}	
	@Test
	public void keytrolComplete()
	{
		System.out.println("keytrolComplete"); 
	}
	@Test
	public void searchKeytrol()
	{
		System.out.println("searchKeytrol"); 
	}
	@Parameters({"URL1"})
	@Test
	public void deleteKeytrol(String urlVal)
	{
		System.out.println("deleteKeytrol");
		System.out.println(urlVal);
	}
}
