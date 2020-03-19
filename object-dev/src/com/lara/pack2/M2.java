package com.lara.pack2;

class B
{
	int i, j;
	B(int i, int j)
	{
		this.i =i;
		this.j =j;
	}
	public String toString()
	{
		return i + ":" + j;
	}
	
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10, 20);
		System.out.println(b1);
	}
}


/*
output:
com.lara.pack2.B@1db9742

after adding toSring() method

OP
--
10:20



notes:
-----


 */