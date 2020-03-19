package com.lara.pack2;

class E
{
	int i;
	
	@Override
	public String toString() {
		return "i= "  + i;
	}	
}
class F extends E
{
	int j;
	
	@Override
	public String toString() {
		return super.toString() + ", j= "  + j;
	}
}

public class M4 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.i = 10;
		f1.j = 20;
		System.out.println(f1);
	}
}


/*
OP
---
com.lara.pack2.F@1db9742

after toString() override in both the class- E and F

OP
--
i= 10, j= 20


 */