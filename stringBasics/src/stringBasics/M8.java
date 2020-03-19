package stringBasics;

public class M8 {
	public static void main(String[] args) {
		String s1 = "hi India";
		String s2 = "hi \"Inida\"";
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}

/*
OP
---
8
10

notes:
-------
we can \ (escape character) back slash is one of the special character.

though \" is not for ending purpose,  it not considering for that purpose..

\ is not counted, and it is only for providing "

\ mainly used for escape purpose

" starting or ending purpose

*/