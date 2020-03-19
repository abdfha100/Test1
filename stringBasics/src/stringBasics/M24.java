package stringBasics;

public class M24 {
	public static void main(String[] args) {
		String s1 = "xyz";
		s1.concat("hello");
		System.out.println(s1);
	}
}

/*
 OP
 ----
 xyy
 
 notes:
 ------
 concat() method can be used to add, 
Strings are immutable, once created not change

ex: s1 is "xyz"

before concat s1 value is xyz, and
after concta s1 value is xyz only..

 */