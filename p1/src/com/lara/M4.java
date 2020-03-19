package com.lara;
class D
{
	static int i;
	static
	{
		System.out.println("from D.SIB");
	}
}
public class M4 {
	public static void main(String[] args) throws Exception {
		System.out.println(D.i);
		System.out.println("-------------");
		Class c1 = Class.forName("com.lara.D");
		System.out.println(c1);
	}
}


/*
 * we get the class as object, we can get compte schema of tht cls
 * 
 * */
