package app3;

public class M32 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("test");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("---------------");
		sb.append("123456789987654321");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
 
20
4
---------------
22
42
22
22

sb.trimToSize();
what ever extra size will be tere, tat will be rmoed
both sixe and lenght wil be the saem

dll is 16 and added as 4 "test"
we are getting 20

we can call trimsixe once added is compltedd..


 */