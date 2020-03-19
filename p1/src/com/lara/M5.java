package com.lara;
class E
{
	
}
public class M5 {
	public static void main(String[] args) throws Exception{
		E e1 = new E();
		Class c1 = e1.getClass();
		System.out.println(c1);
		Class c2 = Class.forName("com.lara.E");
		System.out.println(c1 == c2);
	}
}
