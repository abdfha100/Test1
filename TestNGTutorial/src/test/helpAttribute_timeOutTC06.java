package test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class helpAttribute_timeOutTC06 {
	
	@Test
	public void userProfileManagement()
	{
		System.out.println("userProfileManagement");  
	}
	
	@Test
	public void orderManagement()
	{
		System.out.println("orderManagement");
		Assert.assertTrue(false);
	}
	
	@Test(timeOut = 4000)
	public void subscription()
	{
		System.out.println("subscription"); 
	}
	
	@Test
	public void charging()
	{
		System.out.println("charging"); 
	}
	
	@Test
	public void productCatlogue()
	{
		System.out.println("productCatlogue"); 
	}
	
	@Test
	public void deviceManagement()
	{
		System.out.println("deviceManagement"); 
	}
	
	@Test(enabled=true)
	public void billingHistory()
	{
		System.out.println("billingHistory"); 
	}
	
	@Test
	public void Activation()
	{
		System.out.println("Activation");
	}
}
