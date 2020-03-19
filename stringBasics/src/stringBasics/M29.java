package stringBasics;

public class M29 {
	public static void main(String[] args) {
		String s1 = " xyz abc ";
		System.out.println(s1.length());
		s1= s1.trim();
		System.out.println(s1.length());
	}
}

/*
OP
----
9
7

notes:
------
s1.trim() assigning back to s1.
now s1 pointing to new value which has 7,
and no one pointing to old value which had 9..
*/