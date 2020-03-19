package stringBasics;

public class M43 {
	public static void main(String[] args) {
		String s1 = "hello";
		        //   01234
		int i = s1.indexOf('l');
		System.out.println(i);
	}
}


/*
OP
----
2
 
 s1.indexOf('l') 
 there are 2 'l' available in the String s1.
 by default, it will get the first l
 because it is reading from left to right
 */