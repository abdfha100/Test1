package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseM2 {
	
	@Test(groups={"Smoke"})
	public void test2()
	{
		System.out.println("Executing 3rd test-case");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute this BeforeTest first");
	}

}
