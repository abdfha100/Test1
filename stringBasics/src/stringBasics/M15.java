package stringBasics;

class M15 {
	public static void main(String[] args) {
		String s1 = "abc";
		s1 = s1 + "xyz";
		System.out.println(s1);
	}
}

/*
OP
---
abcxyz

notes:
-------

+ got overloaded and it can be used to add anything in the String Class.

+ got overloaded, and it can not only add number but also a String.

*/