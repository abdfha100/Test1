package stringHandling02;

public class M2StringReverse {
	public static void main(String[] args) {
		
		String s = "Shariff";
		String t = "";
		
		for(int i= s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		
		if (t.equals(s)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
