package stringBuffer03;

public class M30 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("********************");
		
		sb.append("123456789987654321");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
OP
---
0
16
********************
18
34

 */