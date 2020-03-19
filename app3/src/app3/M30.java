package app3;

public class M30 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("---------------");
		sb.append("123456789987654321");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
16
0
---------------
18
34

 by dflt cpaitiy is 16 and 
 later added more, the cacitiy is increaing automatiallly
 Strinbuffer is mutalbl
 in the sme obje we can add any no of chareters......
 
 
 */