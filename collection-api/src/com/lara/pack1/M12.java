package com.lara.pack1;

import java.util.TreeSet;

public class M12 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(90);
		set.add(100);
		set.add(130);
		set.add(120);
		set.add(0);
		set.add(150);
		System.out.println(set);
	}
}

/*

OP
--
[0, 90, 100, 120, 130, 150]

like a priority queue, we can use TreeSet for sorting..

the dflt TreeSet is sorted one

 */