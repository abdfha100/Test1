package stringBasics;

public class M51 {
public static void main(String[] args) {
		
		String s1 = "java technologies";
		          // 0123456789       
		String s2 = s1.substring(0, s1.indexOf(' '));
		String s3 = s1.substring(s1.indexOf(' ') + 1, s1.length());
		String s4 = s1.substring(s1.indexOf(' ') + 1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}

/*
java technologies
java
technologies  // here, s1.length() it optional to read the second argument...
technologies

 */