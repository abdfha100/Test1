package com.lara.pack2;
class C
{
	int i;
	@Override
	public String toString() {
		return "i= " + i;
	}
	}
class D
{
	int j;
	C c1;
	
	@Override
	public String toString() {
		return "j= " + j  + "," + c1;
 	}
	
	}

public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.i = 10;
		D d1 = new D();
		d1.j= 20;
		d1.c1 = c1;
		System.out.println(c1);
		System.out.println(d1);
	}
}


/*
OP
---
com.lara.pack2.C@1db9742
com.lara.pack2.D@106d69c

d has a c..
in case of has a relation ship...
over ride toString() in the C class  (ctrl + spacebar)

over ride toString() in the D class  too (ctrl + spacebar)

Now the OP
----------
i= 10
j= 20,i= 10


 */