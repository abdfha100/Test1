package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;

public class M4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		Iterator it = list.iterator();
		while(it.hasNext()) // check whether element is there or not
		{
			System.out.print(it.next() + ", ");
		}	
	}
}

/*
OP
--
90, 901, 910, 190, 0, 9,  


here, we are using Iterator  and while loop and inside loop using hasNext() and next() method..


Iterator is a interface an it is used for reading elements

 */