package stringBasics;

public class M38 {
	public static void main(String[] args) {
		String s1 = "hello";
		char[] chars = s1.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + ", ");
		}
	}
}

/*

OP
---
h, e, l, l, o, 

*/
