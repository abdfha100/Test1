package com.lara.pack1;

import java.util.ArrayList;

public class M4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("emp1");
		list.add("emp2");
		list.add("emp3");
		
		System.out.println("Before clear: " + list);
		list.clear();
		System.out.println("After clear: " + list);
	}

}
