package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class helpAttributeEnabledTC07 {
	
	@Parameters({"URL3"})
	@Test
	public void userProfileManagement(String urlVal)
	{
		System.out.println("userProfileManagement");
		System.out.println(urlVal);
	}
	
	@Test
	public void orderManagement()
	{
		System.out.println("orderManagement");
	}
	
	@Test
	public void subscription()
	{
		System.out.println("subscription"); 
	}
	
	@Test
	public void charging()
	{
		System.out.println("charging"); 
	}
	
	@Test(enabled = false)
	public void productCatlogue()
	{
		System.out.println("productCatlogue"); 
	}
	
	@Test
	public void deviceManagement()
	{
		System.out.println("deviceManagement"); 
	}
	
	@Test(enabled=false)
	public void billingHistory()
	{
		System.out.println("billingHistory"); 
	}
	@Parameters({"URL1"})
	@Test
	public void Activation(String urlVal)
	{
		System.out.println("Activation");
		System.out.println(urlVal);
	}
}
