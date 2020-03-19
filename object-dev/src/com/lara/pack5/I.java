package com.lara.pack5;
class H
{
	int x;
}
public class I implements Cloneable
{
	H h1;
	public static void main(String[] args) 
	throws CloneNotSupportedException
	{
		I obj1 = new I();
		obj1.h1 = new H();
		obj1.h1.x = 10;
		
		I obj2 = (I) obj1.clone();
		System.out.println(1 + ":" + obj2.h1.x);
		obj1.h1.x = 20;
		System.out.println(2 + ":" + obj2.h1.x);
		obj1.h1.x = 30;
		System.out.println(3 + ":" + obj1.h1.x);
	}
}


/*
OP
--

1:10
2:20
3:30


notes:
------
it is shallow copy..
if attribute are primitive then deep copy
if 






















 */