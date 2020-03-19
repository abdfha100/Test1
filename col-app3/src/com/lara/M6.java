package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M6 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(90);
		list.add(90);
		list.add(90);
		list.add(90);
		System.out.println(list);
		
		//before ArryList is not ArrayList safed one
		
		list = Collections.synchronizedList(list);
		//thread is safe now.. 
	}
}

/*

synchronizedList(list) is List type.. that is the reason List list = new ArrayList();

List is the super Interface of ArrayList()..
Map


vecor by deflt syncrhonised and it can be used in mutl thred
we wont get data corrp
only one thread allowed to enter
not more than one tread..

array list 
hash set
proriyt queue
 ---- using in multi thread
 ----  more than one thread enerin..
 --- chaances of data corrruption..
 --- diff out put
 ---- shod not performed more than one thread..


 there are 2 synchormnised..
 1) vector
 2) hashTable
  mult therd enrvirnemtn
  - that time we need to provide the synchronised...

  1)ArrayList
  2)HashSet
  3)PriorityQueue




 */