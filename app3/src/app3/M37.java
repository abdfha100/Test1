package app3;

public class M37 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		                                  //0123456789    
		System.out.println(sb);
		sb.delete(20, 30);
		System.out.println(sb);
	}
}
/*
hellotoall
Exception in thread "main" java.lang.StringIndexOutOfBoundsException
	at java.lang.AbstractStringBuilder.delete(AbstractStringBuilder.java:760)
	at java.lang.StringBuffer.delete(StringBuffer.java:430)
	at app3.M37.main(M37.java:8)

 
 */