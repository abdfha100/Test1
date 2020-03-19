package stringBasics;

class M22 {
	public static void main(String[] args) {
		String s1 = NULL;
		System.out.println(s1.length());
	}

}

/*
OP : compiaion error
---
F:\aug-8th\NewJun19\strings-basics\src>javac -d ../classes M22.ja
M22.java:5: error: cannot find symbol
                String s1 = NULL;
                            ^
  symbol:   variable NULL
  location: class M22
1 error




notes:
-------
because upper-case Null is not a keyword
it can be used as an identifier, but not as a keyword

*/