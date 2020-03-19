package stringBasics;

class M11 {
	public static void main(String[] args) {
		String s1 = "xyz abc";
		String s2 = "xyz \\ abc";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
/*
OP
---
abc xyz
abc \ xyz
7
9

notes:
-------

\ the main purpose of back slash is for escaping purpose
if we want other feature, like printing the \ then use \\

*/