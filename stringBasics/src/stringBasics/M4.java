package stringBasics;

class M4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3.equals(s4));
	}
}
/*
OP
---
true
true


notes:
-------
s1 and s2 are without new operator, and s3 and s4 are with new operator..

equals() is a object class-String, inherited to String Class and it is also got over raided

comparing the 2 content of the String..
equals() method is used to check the content of the object.

*/