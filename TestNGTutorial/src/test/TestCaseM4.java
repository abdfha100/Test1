package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseM4 {
	
	@Test
	public void WebloginHomeLoan()
	{
		System.out.println("WebloginHomeLoan");  // Selenium code..
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("After Method will execute after every method");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("After class will execute after all the mts of this cls");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan"); // Apium code..
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeoan()
	{
		System.out.println("LoginAPIHomeLoan"); // API code..
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod execute every method in this class");
	}
}
