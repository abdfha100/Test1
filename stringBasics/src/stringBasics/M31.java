package stringBasics;

public class M31 {
	public static void main(String[] args) {
		String s1 = "xyz";
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);
	}
}

/*
OP
----
xyz
xyz

notes:
------
s1.toUpperCase(); method will be converting lower case to upper case.
whenever a change is happening generating a new String,
but we are not assigning to any s1 or s2.

*/