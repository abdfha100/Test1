package com.lara.pack1;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add(5);
		list2.add(6);
		
		list1.add(2, list2);
		
		System.out.println(list1);
	}
}
