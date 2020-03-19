package app3;

public class M25 {
	public static void main(String[] args) {
		String s1 = "java";
		String va= "va";
		String s2 = "ja".concat(va);  //  concat will alwauys new operator...
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}



/*
 
false
true
 
 */