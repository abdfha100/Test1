package stringBuffer03;

public class M37 {
	
public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hellotoall");
		                                  //0123456789
		System.out.println(sb);
		
		sb.delete(20,30);
	
		System.out.println(sb);		
	}

}

/*
exception
---------
Exception in thread "main" java.lang.StringIndexOutOfBoundsException
	at java.lang.AbstractStringBuilder.delete(AbstractStringBuilder.java:760)
	at java.lang.StringBuffer.delete(StringBuffer.java:430)
	at stringBuffer.M37.main(M37.java:11)
 */