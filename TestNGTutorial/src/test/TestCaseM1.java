package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseM1 {
	
	@AfterTest
	public void lastExcution()
	{
		System.out.println("I will execute-AfterTest this at the end");
	}
	@Test
	public void test1()
	{
		System.out.println("Hello(test1)");
	}
	
	@Test(groups= {"Smoke"})
	public void test2()
	{
		System.out.println("Bye(test2)");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass will exceute only bfre these metds(lstExe, test1, test2)");
	}
}
