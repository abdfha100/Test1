package com.lara.pack;

import java.util.ArrayList;
import java.util.ListIterator;

public class M16 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list); 
		ListIterator it = list.listIterator();  
		
		list.add(100);  // after getting iterator and again addint a new element. it won't allow..
		
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println();		
		System.out.println(list);
	}
}


/*

OP
------- 
[90, 901, 910, 190, 0, 9]
Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
	at java.util.ArrayList$Itr.next(ArrayList.java:859)
	at com.lara.pack.M16.main(M16.java:22)

 
 */