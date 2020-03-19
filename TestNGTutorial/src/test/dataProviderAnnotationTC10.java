package test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProviderAnnotationTC10 {
	
	@Test(dataProvider= "getData")
	public void getKeytrol(String userName, String password)
	{
		System.out.println("getKeytrol");
		System.out.println(userName);
		System.out.println(password);
	}
	
	@Parameters({"URL2"})
	@Test
	public void syncKeytrol(String urlname)
	{
		System.out.println("syncKeytrol");
		System.out.println(urlname);
	}
	@Parameters({"URL1"})
	@Test
	public void deleteKeytrol(String urlVal)
	{
		System.out.println("deleteKeytrol");
		System.out.println(urlVal);
	}
	@DataProvider
	public Object[][] getData()
	{
		//Totally need 5 set of data in getKeytrol page.
		//combination userName and password = good credit history
		//userName and password = no credit history
		//userName and password = fraudlant credit history
		//userName and password = recently gain credit history
		//userName and password = no credit history, but very old customer.
		
		Object[][] data  =new Object[5][2];
		//combination userName and password = good credit history - 1st set
		data[0][0] = "firstUserName";
		data[0][1] = "firstUserPassword";
		
		//userName and password = no credit history =- 2nd set
		data[1][0] = "secondUserName";
		data[1][1] = "secondUserPassword";
		
		//combination userName and password = fraudlant credit history - 3rd set
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdUserPassword";
		
		//userName and password = recently gain credit history 4th set
		data[3][0] = "fourthdUserName";
		data[3][1] = "fourthUserPassword";
		
		//userName and password = no credit history, but very old customer 5th set
		data[4][0] = "fifthUserName";
		data[4][1] = "fifthUserPassword";
		return data;
	}
}
