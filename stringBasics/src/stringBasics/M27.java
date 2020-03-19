package stringBasics;

public class M27 {
	public static void main(String[] args) {
		String s1 = " xyz abc ";
		System.out.println(s1.length());
		s1.trim(); // new string is generated, but still s1 is pointing to (old string)s1 only.. 
		System.out.println(s1.length());
	}
}

/*
OP
----
9
9

notes:
------
trim() before white space and after white space will be removed..
s1.trim(); 
here, new String is generated, but s1 still pointing to old String value s1 only..

*/