package com.lara.pack5;

public class F implements Cloneable
{
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		F f1 = new F();
		F f2 = (F) f1.clone();
		System.out.println("f1:" + f1);
		System.out.println("f2:" + f2);
	}
}


/*

f1:com.lara.pack5.F@1db9742
f2:com.lara.pack5.F@106d69c




 */