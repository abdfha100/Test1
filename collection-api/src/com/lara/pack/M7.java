package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;

public class M7 {
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
		Object obj; //dec obj
		while(it.hasNext()) // check whether element is there or not
		{
			obj = it.next();  //asssing the obj 
			System.out.print(obj + ", ");
			if(obj.equals(190)) // condin to remove 190 
			{
			it.remove(); //  removed - 190
			}
		}
		System.out.println();
		System.out.println(list);
	}
}



/*
OP
---
[90, 901, 910, 190, 0, 9]
90, 901, 910, 190, 0, 9, 
[90, 901, 910, 0, 9]
 
 removing a specific element...
 ex: 190 is removed..
 
 
 */