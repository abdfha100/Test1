package com.lara.pack;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		for(Object elements: list) // every array list is saved in the Object...
		{
			System.out.println(elements + ", ");			
		}
	}
}

/*
90, 
901, 
910, 
190, 
0, 
9,

here we are using enhanced for loop to print the list content.
 */