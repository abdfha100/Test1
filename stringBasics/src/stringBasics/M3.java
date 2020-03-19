package stringBasics;

class M3 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
	}
}

/*
OP
---
false

notes:
-------
why false?

when ever 'new' operator is used, then new object is created..
s1 purpose one new object and s2 purpose one new object.
== operator is checking whether they are pointing to the same object or not..

*/
