package com.lara;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class C
{
	int param1;
	C()
	{
		
	}
	void test1()
	{
		
	}
}
public class M3 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("com.lara.C");
		Field[] fields = c1.getDeclaredFields();
		for(Field f1 : fields)
		{
			System.out.println(f1.getName() + ":" + f1.getType());
		}
		System.out.println("-----------");
		Constructor[] constructor = c1.getConstructors();
		for(Constructor con :  constructor)
		{
			System.out.println(con);
		}
		
		System.out.println("-----------");
		Method[] methods = c1.getDeclaredMethods();
		for(Method method :  methods)
		{
			System.out.println(method.getName() + ":" + method.getReturnType());
		}
	}
}
