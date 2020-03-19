package com.lara;
class F
{
	
}
public class M6 {
	public static void main(String[] args) throws Exception{
		F f1 = new F();
		test(f1);
		test(90);
		test("hello");
	}
	
	static void test(Object obj) throws Exception
	{
		Class c1 = obj.getClass();
		System.out.println(c1);
	}
}
