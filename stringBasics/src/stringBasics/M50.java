package stringBasics;

public class M50 {
public static void main(String[] args) {
		
		String s1 = "java technologies";
		          // 0123456789       
		String s2 = s1.substring(5, 17);
		String s3 = s1.substring(0, 4);  // inclusive and exclusive reading
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

/* 
OP
----
java technologies
technologies
java

passing 2 arguments
inclusive and exclusive

 */