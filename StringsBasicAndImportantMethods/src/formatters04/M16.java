package formatters04;

public class M16 {
public static void main(String[] args) {
		
		int num = 123456;
		
		String s1= String.format("num is (%-020d)", num);
		
		System.out.println(s1);
	}
}
/*
Exception
*********
*Exception in thread "main" java.util.IllegalFormatFlagsException: Flags = '-0'
	at java.util.Formatter$FormatSpecifier.checkNumeric(Formatter.java:3027)
	at java.util.Formatter$FormatSpecifier.checkInteger(Formatter.java:2982)
	at java.util.Formatter$FormatSpecifier.<init>(Formatter.java:2729)
	at java.util.Formatter.parse(Formatter.java:2560)
	at java.util.Formatter.format(Formatter.java:2501)
	at java.util.Formatter.format(Formatter.java:2455)
	at java.lang.String.format(String.java:2940)
	at formatters04.M16.main(M16.java:8)
 */