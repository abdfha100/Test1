package com.lara.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M8 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person(19, 6.2, 70.8));
		list.add(new Person(22, 5.3, 69.2));
		list.add(new Person(34, 5.6, 43.4));
		list.add(new Person(18, 4.9, 87.4));
		list.add(new Person(56, 5.7, 90.4));
		list.add(new Person(40, 6.1, 39.4));
		
		System.out.println(list);
		
		Collections.sort(list, new age());
		System.out.println(list);
		
		Collections.sort(list, new height());
		System.out.println(list);
		
		Collections.sort(list, new weight());
		System.out.println(list);
	}

}
