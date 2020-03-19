package formatters04;

public class M19 {
public static void main(String[] args) {
		
		double num = 1234.5678;
		
		String s1= String.format("num is %.3f", num);
		
		System.out.println(s1);
	}

}

/*
OP
--
num is 1234.568


note:
*****

%[argument number] [flags] [width] [.precision] convertion_type
 
 *
 */