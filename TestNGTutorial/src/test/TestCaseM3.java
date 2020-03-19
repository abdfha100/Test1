package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCaseM3 {
	
	@Test
	public void WebloginCarLoan()
	{
		System.out.println("WebloginCarLoan");  // Selenium code..
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I will be executing after this suite");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan"); // Apium code..
	}
	
	@Test
	public void MobileSigninCarLoan()
	{
		System.out.println("MobileSigninCarLoan"); // Apium code..
	}
	
	@Test
	public void MobileSignoutCarLoan()
	{
		System.out.println("MobileSignoutCarLoan"); // Apium code..
	}
	
	@Test
	public void MobileLoan()
	{
		System.out.println("MobileLoan"); // Apium code..
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan"); // API code..
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am no-1");
	}
}
