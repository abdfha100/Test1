package com.lara.pack1;

import java.util.ArrayList;

public class M1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // mainting order of the list
		list.add(90);
		list.add(190);
		list.add("test");
		list.add(true);
		list.add('a');
		list.add(new Thread());
		System.out.println(list);
	}
}

/*
OP
--
[90, 190, test, true, a, Thread[Thread-0,5,main]]

upcasting to Object cls in all four streams..

2) we didn't mention size, in colleinion API, no need to mention aboutn the size.

3) in all colleionion API clas, in Object Class toSting(), hashcode() and equal() are over rided..
   bocos of that we can print the content.
   
   in 
   



 */