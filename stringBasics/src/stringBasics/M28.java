package stringBasics;

public class M28 {
	public static void main(String[] args) {
		String s1 = " xyz abc ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}
/*
OP
----
9
9
7

notes:
------
trim method return vale assigning to s2 at line-7
s2- point to new String s2. 
*/