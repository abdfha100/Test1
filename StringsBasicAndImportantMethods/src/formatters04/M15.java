package formatters04;

public class M15 {
public static void main(String[] args) {
		
		int num = 123456;
		
		String s1= String.format("num is (%-20d)", num);
		
		System.out.println(s1);
	}

}


/*
OP
--
num is (123456              )
 */