package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;

public class M11 {
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
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		System.out.println("----------------");
		
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		
		System.out.println(list);
	}

}

/*
for one Iterator, 
by using one Array List, we can read all the elements only one time..
not more than one time..

[90, 901, 910, 190, 0, 9]
90, 901, 910, 190, 0, 9, 
----------------

[90, 901, 910, 190, 0, 9]




 */
