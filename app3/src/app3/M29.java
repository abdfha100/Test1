package app3;

public class M29 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

/*
5
16

the dftl capcity is 16
while adding 17 charc , the cpaity will be increins...
 */