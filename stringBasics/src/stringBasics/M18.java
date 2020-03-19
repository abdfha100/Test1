package stringBasics;

class M18 {
	public static void main(String[] args) {
		String s1 = null + null;
		System.out.println(s1);
	}
}

/*
OP
---
M18.java:5: error: bad operand types for binary operator '+'
                String s1 =  null + null;
                             ^
  first type:  <null>
  second type: <null>
1 error


notes:
-------
String s1 =  null + null;
null can be used any data type..
if both Left hand and Right hand operand are null then will get compiler error

*/