package com.lara.pack1;

import java.util.ArrayList;

public class M5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("A");
		list.add(3);
		list.add(null);
		list.add(true);
		System.out.println(list);
		
		ArrayList cloneList = new ArrayList();
		cloneList = (ArrayList) list.clone();
	
		System.out.println(cloneList);
	}
}
