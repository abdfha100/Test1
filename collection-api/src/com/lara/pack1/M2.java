package com.lara.pack1;

import java.util.ArrayList;

public class M2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add('A');
		list1.add('B');
		list1.add('C');
		list1.add('D');
		
		ArrayList list2 = new ArrayList();
		list2.add('E');
		
		list1.addAll(list2);
		System.out.println(list1);
	}
}
