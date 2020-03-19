package com.lara.pack6;

import java.lang.reflect.Method;

class B
{
	void test1()
	{
		
	}
	int test2()
	{
		return 20;
	}
	String test3()
	{
		return "hello";
	}	
}
public class M2 {
	public static void main(String[] args) {
		B  b1 = new B();
		String s1 = "hello";
		Integer obj = 200;
		info(b1);
		System.out.println("=================");
		info(s1);
		System.out.println("=================");
		info(obj);
	}
	
	static void info(Object obj)
	{
		Class c1 = obj.getClass();
		Method[] methods = c1.getMethods();
		for(Method method :  methods)
		{
			System.out.println(method.getName() + ":" + method.getReturnType());
		}
	}
}
