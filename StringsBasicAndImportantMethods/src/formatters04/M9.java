package formatters04;

public class M9 {
public static void main(String[] args) {
		
		
		double i = 1.5;
		
		System.out.printf("i value is %d", i);	
	}

}

/*
exception:
**********
*Exception in thread "main" i value is java.util.IllegalFormatConversionException: d != java.lang.Double
	at java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4302)
	at java.util.Formatter$FormatSpecifier.printInteger(Formatter.java:2793)
	at java.util.Formatter$FormatSpecifier.print(Formatter.java:2747)
	at java.util.Formatter.format(Formatter.java:2520)
	at java.io.PrintStream.format(PrintStream.java:970)
	at java.io.PrintStream.printf(PrintStream.java:871)
	at formatters04.M9.main(M9.java:9)
 */