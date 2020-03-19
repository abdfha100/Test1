package stringBasics;

class M21 {
	public static void main(String[] args) {
		String s1 = null;
		System.out.println(s1.length());
	}
}


/*
OP : run time error..
---
F:\aug-8th\NewJun19\strings-basics\src>java -cp ../classes M21
Exception in thread "main" java.lang.NullPointerException
        at M21.main(M21.java:6)

notes:
-------
calling length() method which is pointing to null, and
it will be getting NullPointerException..

*/