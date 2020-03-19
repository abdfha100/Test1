package app3;

public class M31 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(2000);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("---------------");
		sb.append("123456789987654321");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
2000
0
---------------
18
2000

dflt capicity is 16
but we can spiciy what evr capicity we want..


 */