package com.lara.pack6;

import java.lang.reflect.Field;

class A
{
	int param1;
	String firstName;
	}

public class M1 {
	public static void main(String[] args) {
		Object obj = new A();
		test(obj);
		System.out.println("=================");
		test("hello");
		System.out.println("=================");
		test(3000);
		}
	
	static void test(Object obj)
	{
		Class c1 = obj.getClass();
		//System.out.println(c1.getName());
		
		Field[] fields = c1.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getType());
			System.out.println("---------------");
	}
	}
}



/*


 java.lang
---------

1. Object:
    all the common features which are required for any object is kept inside the Class-Object.
    it contains the general information which are required in any object...

2. Class: 
	to know the informaiton about object to which class is defined.

  ex:
  class Object
  { 
    ///
  }

  ********************************************

  class Class
  {
  
  }
 
 
 */
