package stringBasics;

class M5 {
	public static void main(String[] args) {
		String s1 = "hello";
		int i = s1.length();
		System.out.println(i);
		System.out.println(s1.length());
	}
}

/*
OP
---
5
5

notes:
-------
int i = s1.length(); 
---------------------
length() is a method, and whereas in the array it is property 'length' 
to know the length of the array
to find the size of the array.

System.out.println(s1.length());
------------------------------
here, it is the method to know the length of the String by using length() method
to find out the total number of characters in the String.

*/