package stringBasics;

public class M32 {
	public static void main(String[] args) {
		String s1 = "xyz";
		System.out.println(s1);
		String s2= s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
	}
}

/*
OP
----
xyz
xyz
XYZ

notes:
------
toUppercase() XYZ assigning to s2,
and s1 is still pointing to old s1 value..

*/