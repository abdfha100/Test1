package stringBasics;

class M16 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = null;
		String s3 = s1 + s2;
		String s4 = s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}


/*
OP
---
abc
null
abcnull
nullabc


notes:
-------
+ operator can also add with the null object

+ operator require any one of the operand should be number or both are number..

*/