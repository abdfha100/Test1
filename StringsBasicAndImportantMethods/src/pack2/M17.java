package pack2;

public class M17 {
public static void main(String[] args) {
		
		String s1= "java";
		
		// in s2 has both constants "ja" and "va" and it points to same as s1 points
		String s2= "ja" + "va"; 
		
		//here it will whether s1 and s2 are pointing to the same object or not.
		System.out.println(s1 == s2);
		
		//here it will check the content of s1 and s2
		System.out.println(s1.equals(s2));
	}
}

/*
true
true
 */