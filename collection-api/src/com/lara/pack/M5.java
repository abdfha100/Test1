package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		ListIterator it = list.listIterator(); // to reading the list.  it is exteding to Iteraoor interface..
		while(it.hasNext()) // chck whethete elemtnt is thre or not
		{
			System.out.print(it.next() + ", ");
		}	
	}

}

/*
OP
---
90, 901, 910, 190, 0, 9, 

 */