package stringBasics;

class M2 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
	}

}

/*
OP
---
true

notes:
-------
S1 and S2 hello
== operator checks whether s1 and s2 are pointing to the same object or not?
No new object for s2, so both s1 and s2 are pointing to the same object..
because of the same content

*/