package com.lara.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M1_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(19);
		list.add(91);
		list.add(78);
		list.add(92);
		list.add(39);
		System.out.println(list);
		Collections.sort(list); //using Collection cls to sort and deflt sort is assending..
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());  // to dis in descending...
		System.out.println(list);
	}
}


/*
 * 


OP
--
[90, 19, 91, 78, 92, 39]
[19, 39, 78, 90, 91, 92]
[92, 91, 90, 78, 39, 19]
main features are printing and sorting...

condion
---
1) all elelment same type else will get cls cast exception..
  ex: list.add(29.0);
   Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double

2) No element can be null.. else will null poite expciton...
  ex: list.add(null);
   Exception in thread "main" java.lang.NullPointerException
   
3) all elemnts shld be comprable type or we need to supply a separate comparator Object..   
   all wraper clss implemteing comprable interface... 
    here, all are integer objects stored in the list...
   
   

 



 */