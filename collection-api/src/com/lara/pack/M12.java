package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;

public class M12 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list); 
		Iterator it = list.iterator();
		list.add(100);  //after getting iterator, we are adding one more element. ex: list.add(100);
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		System.out.println(list);
	}
}


/*

 [90, 901, 910, 190, 0, 9]
Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
	at java.util.ArrayList$Itr.next(ArrayList.java:859)
	at com.lara.pack.M12.main(M12.java:20)
	
	
we can add after while loop..
after getting an Iterator, go for read..
before readind don't add any new element into the ArrayList..	
 
 
 Two types of Iterator
 --------------------------
 1- fail fast Iterator  - By deflt we are getting fail fast itraot and this won't allow concorrnt modifications
 
 2- fail safe Iterator  - but this allow  concorrnt modifications..
   fail safe iteraor are genratiing only in concurrency...
   
   
   
   
 
 
 */
