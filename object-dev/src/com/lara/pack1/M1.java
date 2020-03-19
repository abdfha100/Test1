package com.lara.pack1;

class A
{
	int i;
	}

public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
	}
}

/*
 
 * OP
 * ---
 * com.lara.pack1.A@1db9742/
 * 
 * memory address of the object
 * 
 * toString() is part of every class
 * while printing will call internally call toString()
 * it is inherited from Object class to A -class 
 * 
 */