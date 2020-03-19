package stringBasics;

class M10 {
	public static void main(String[] args) {
		String s1 = "abc \ xyx";
		System.out.println(s1);
	}
}
/*
OP
---
M10.java:5: error: illegal escape character
                String s1 = "abc \ xyz";
                                  ^
1 error

notes:
-------
\ is escape character, and it used for escape character and
it is the main feature of the character.


*/