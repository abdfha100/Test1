package com.lara.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M10 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person(19, 6.2, 70.8));
		list.add(new Person(22, 5.3, 69.2));
		list.add(new Person(34, 5.6, 43.4));
		list.add(new Person(18, 4.9, 87.4));
		list.add(new Person(56, 5.7, 90.4));
		list.add(new Person(40, 6.1, 39.4));
		
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) -> ((Person)o1).age - ((Person)o2).age);
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) ->  ((Person)o1).height - ((Person)o2).height);
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) -> ((Person)o1).weight - ((Person)o2).weight);
		System.out.println(list);
	}

}
