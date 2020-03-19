package com.lara.pack;

import java.util.ArrayList;
import java.util.ListIterator;

public class M18 {
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
		it.add(100); // after getting list, we can't add element using list, but we can use by using it.add
		//adding element by using ListIterator..
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
90, 901, 910, 190, 0, 9, 
[100, 90, 901, 910, 190, 0, 9]

elements are adding at the begning..
 
 */
