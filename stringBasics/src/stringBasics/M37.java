package stringBasics;


public class M37 {
	public static void main(String[] args) {
		String s1 = "hello";
		char[] chars = s1.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
	}
	

}

/*
OP
---
h
e
l
l
o

notes:
------
reading every character into an array.
using toCharArray() method, and 
iterating with the help of for loop 
for reading every character by character..

*/