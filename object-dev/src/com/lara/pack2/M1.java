package com.lara.pack2;

class A
{
		int i;
//		public String toString()
//		{
//			return "its A type object with i value as: " + i;
//		}
}

public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
		String s1 = "desc" + a1;
		System.out.println(s1);
		}
	}
/*
 output:
 --------
 its A type object with i value as: 20

 override the toString() to get the meaningful message..
 
 whenever any reference variable adding to the String from Object class
  
 by default printing the address rather than the content...
 
 where ever data is required, we have to use toString() override.
 we required the status of the object rather than address of the object..
 
 after commenting the toString() block
 out put
 -------
com.lara.pack2.A@1db9742
desccom.lara.pack2.A@1db9742
 
 */