package test;


import org.testng.annotations.Test;

public class helpAttribute_dependsOnMethodsTC05 {
	
	@Test
	public void userProfileManagement()
	{
		System.out.println("userProfileManagement");  
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
	
	@Test
	public void billingHistory()
	{
		System.out.println("billingHistory"); 
	}
	
	@Test(dependsOnMethods= {"userProfileManagement", "orderManagement", "productCatlogue", "subscription"})
	public void Activation()
	{
		System.out.println("Activation");
	}
}
