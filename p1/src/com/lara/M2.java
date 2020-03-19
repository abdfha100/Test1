package com.lara;

import java.lang.reflect.Method;

class B
{
	void test1()
	{
		
	}
	void test2()
	{
		
	}
	public int test3()
	{
		return 10;
	}
}
public class M2 {
	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("com.lara.B"); //java.lan.class.object will be loaded into the memry
		Method[] methods = c1.getMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName() + ":" + method.getReturnType());
		}
	}
}
