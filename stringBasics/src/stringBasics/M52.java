package stringBasics;

public class M52 {
	public static void main(String[] args) {
		String s1 = "abc";
		          // 012
		System.out.println(s1.substring(0, 0).length());
		System.out.println(s1.substring(0, 1).length());
		System.out.println(s1.substring(0, 2).length());
		System.out.println(s1.substring(1, 1).length());
		System.out.println(s1.substring(2, 2).length());
	}
}


/* 

OP
-----
a
ab

0
1
2
0
0

notes:
-----
more preference to exclusive..
0,0 = inclusive and exclusive

if you supply inclusive and exclusive same ex: 0,0 
then you will not get any thing
1,1  it will give blank sting
2,2  it will give the empty string...
 */