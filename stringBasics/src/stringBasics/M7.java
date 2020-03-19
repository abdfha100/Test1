package stringBasics;

class M7 {
	public static void main(String[] args) {
		String s1 = "Hi India";
		String s2 = "Hi "India"";
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}

/*
OP compilation error
--------------------
M7.java:6: error: ';' expected
                String s1 = "Hi "India"";
                                 ^
M7.java:6: error: ';' expected
                String s2 = "Hi "India"";
                                      ^
2 errors

notes:
-------

"(double code ) is ending. we can't keep "(double code) in the middel of the String..

*/