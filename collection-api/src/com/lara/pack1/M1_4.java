package com.lara.pack1;

import java.util.ArrayList;
import java.util.Collections;

class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i =i;
	}
	@Override
	public String toString() {
		return "i= " +i;
	}
	
	@Override
	public int compareTo(Object o) {
		return i - ((A)o).i;
	}
}
public class M1_4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new A(90));
		list.add(new A(1));
		list.add(new A(901));
		list.add(new A(10));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*
OP
--
[com.lara.pack1.A@1db9742, com.lara.pack1.A@106d69c, com.lara.pack1.A@52e922]

ArrayList() is interanally calling
toStirng() of Cls-A on every element.
inside A-cls toString is not overrided..

after adding toSting overloading in cls-A
OP
--
[i= 90, i= 91, i= 9000]
 
 note: toString() shd be ovorrided...

 gettging:
 Exception in thread "main" java.lang.ClassCastException: com.lara.pack1.A cannot be cast to java.lang.Comparable


After adding comparalble interface in the cls-A
OP
--
[i= 90, i= 1, i= 901, i= 10]
[i= 1, i= 10, i= 90, i= 901]


***
adding any elelments into Arraylist
1- toStirn() shd be over ridee.
2- inorder to acihive sorting all elemtn shd be of the same type
3- to achive sorting no element shd can be null.
4- elemtnt sdhdl be comparable type or else shld pass a sepate comparator
 
 /
 */