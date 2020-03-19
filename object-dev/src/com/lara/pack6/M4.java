package com.lara.pack6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class D
{
	int i;
	
//	D()
//	{
//		System.out.println("D()");
//	}
	
//	D(int i)
//	{
//		System.out.println("D(int)");
//	}
	
	void test1()
	{
		System.out.println("from test");
	}
	void test2(String s1)
	{
		System.out.println("from test2: " + s1);
	}
	void test3(String s1, int i, double j)
	{
		System.out.println("from test3: " + s1  + ": " + i + ": " + j);
	}
	int test4()
	{
		System.out.println("from test4");
		return 1111;
	}
}
public class M4 {
	public static void main(String[] args)
	throws Exception
	{
		Class c1 = Class.forName("com.lara.pack6.D");  //readin a cls
		Object obj = c1.newInstance(); // creating a new obj to C-Class(third-way to create an object)
//		
//		Field f1 = c1.getDeclaredField("i");
//		f1.set(obj, 20); // assinging the value i=20;
//		
//		Method m1 = c1.getDeclaredMethod("test1");
//		m1.invoke(obj);
//		System.out.println(f1.getInt(obj));   //Ctrl+shift+c//
		
//		Method m2 = c1.getDeclaredMethod("test2", String.class);  //in mehtod-2, supply the one arguement...
//		m2.invoke(obj, "hello");  //supply the one arguement...
		
//		Method m3 = c1.getDeclaredMethod("test3", String.class, int.class, double.class);
//		m3.invoke(obj, "hello", 25, 4.5);
		
		Method m4 = c1.getDeclaredMethod("test4");
		Object value = m4.invoke(obj);
		System.out.println(value);
		System.out.println();
	}
}


/*
OP
---
from test
20


***************************
from test2: hello

*************************
from test3: hello: 25: 4.5


**********************
from test4
1111
******************************

D()
from test4
1111

**********************************************

Refelection API demand no argument constructor...

 */