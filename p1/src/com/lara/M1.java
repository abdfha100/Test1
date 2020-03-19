package com.lara;

import java.lang.reflect.Field;

public class M1 {
	
	static class A
	{
		int i;
		int j;
		String k;
	}
	
	public static void main(String[] args)
	throws Exception
	{
		Class c1 = Class.forName("com.lara.M1$A");  //M1 is outer cls and A is inner cls
		Field[] fields = c1.getDeclaredFields();
		for(Field f1 : fields)
		{
			System.out.println(f1.getName() + ":" + f1.getType());
		}
	}
}
