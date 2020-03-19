package com.lara.pack1;

import java.util.HashSet;

public class M10_1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set);
	}
}



/*

OP
--
true
false
false
false
false
[90]

HashSet set = new HashSet();
it wont allow duplicate... it wont get como err
simply says false

we can add any tupe or any numbr of elemt
ther is no proioty in the HashSet..
its only to avoid the duplicates..

 hashSet interanlly calling hashcode().

how to sort the elments of set?


*/
