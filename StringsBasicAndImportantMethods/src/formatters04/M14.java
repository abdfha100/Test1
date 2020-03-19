package formatters04;

public class M14 {
public static void main(String[] args) {
		
		int num = 123456;
		
		String s1= String.format("num is (%020d)", num);
		System.out.println(s1);
	}
}

/*
OP
--
num is (00000000000000123456)

 */