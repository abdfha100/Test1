package formatters04;

public class M18 {
public static void main(String[] args) {
		
		int num = 123456;
		
		String s1= String.format("num is %(d", num);
		
		System.out.println(s1);
	}
}

/*
OP
--
num is 123456

 */
