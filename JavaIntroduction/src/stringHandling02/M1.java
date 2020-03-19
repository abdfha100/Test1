package stringHandling02;

public class M1 {
	public static void main(String[] args) {
		//Payment $100 paid
		
		String str2 = new String("Payment $100 paid");
		
		String str1 = "Payment $100 paid";  // This syntax is only valid for the String class, not for others..
		System.out.println(str1.charAt(8));
		//single purchase 
		
		String str3 = "Payments $100 paid";
		System.out.println(str3.indexOf("$"));
		System.out.println(str3.substring(9));
		System.out.println(str3.subSequence(9, 12));
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
	}

}