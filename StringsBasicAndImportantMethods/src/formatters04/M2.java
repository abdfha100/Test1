package formatters04;

public class M2 {
public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2= String.format("==> %s <==", s1);
		
		System.out.println(s1);
		
		System.out.println(s2);
	}
}

/*
OP
--
hello
==> hello <==

 */