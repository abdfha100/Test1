package com.lara.pack5;

public class E {
	public static void main(String[] args) 
		throws CloneNotSupportedException
		{
			E e1 = new E();
			System.out.println(1);
			E e2 = (E) e1.clone();
			System.out.println(2);
		}	
}

/*
excepiton:
--------
1
Exception in thread "main" java.lang.CloneNotSupportedException: com.lara.pack5.E
	at java.lang.Object.clone(Native Method)
	at com.lara.pack5.E.main(E.java:9)


we hve tell runtime enivroetmetn, evnthpuh it is risk..



 */