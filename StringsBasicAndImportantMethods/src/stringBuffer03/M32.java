package stringBuffer03;

public class M32 {
	
public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("test");
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println("********************");
		sb.append("123456789987654321");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("********************");
		
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
OP
--
20
4
********************
22
42
********************
22
22

 */