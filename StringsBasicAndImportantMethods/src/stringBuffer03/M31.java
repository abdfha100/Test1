package stringBuffer03;

public class M31 {
	
public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(2000);
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
--
0
2000
********************
18
2000

 */