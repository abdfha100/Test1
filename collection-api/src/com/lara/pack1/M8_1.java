package com.lara.pack1;
import java.util.LinkedList;

public class M8_1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(129);
		list.add(29);
		list.add(19);
		list.add(12);
		list.add(139);
		list.add(126);
		System.out.println(list);
		System.out.println(list.peek()); // reading the head elemtn
		System.out.println(list);
		System.out.println(list.poll()); //readiong and remoing the head element..
		System.out.println(list);
	}
}


/*

OP
----

[129, 29, 19, 12, 139, 126]
129
[129, 29, 19, 12, 139, 126]


after adding poll()
[129, 29, 19, 12, 139, 126]
129
[129, 29, 19, 12, 139, 126]
129
[29, 19, 12, 139, 126]

//
//Linkedlist
//it conatainols list feature and also queue feature..

  
 * /

 */