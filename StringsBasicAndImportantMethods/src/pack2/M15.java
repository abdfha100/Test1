package pack2;

public class M15 {
	
public static void main(String[] args) {
		
	 	String s1= new String("hello");
		String s2= "hello";
		
		//here it will whether s1 and s2 are pointing to the same object or not.
		System.out.println(s1 == s2);
		
		//here it will check the content of s1 and s2
		System.out.println(s1.equals(s2));
	}

}

/*
false
true

 */