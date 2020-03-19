package stringBasics;

class M20 {
	public static void main(String[] args) {
		String s1 = null + null;
		String s2 = 5 + 6;
		String s3 = null + "";
		String s4 = "" + null;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

/*
OP
---
M20.java:5: error: bad operand types for binary operator '+'
                String s1 = null + null;
                            ^
  first type:  <null>
  second type: <null>
M20.java:6: error: incompatible types: int cannot be converted to String
                String s2 =  5 + 9;
                               ^
2 errors

notes:
-------
null + null 
Compilation error

and 5 + 9
Right hand side is number and Left hand side is a String..

*/