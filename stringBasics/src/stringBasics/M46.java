package stringBasics;

public class M46 {
	public static void main(String[] args) {
		String s1 = "java made easy and also java very popular";
		        //   0123456789
		int i = s1.lastIndexOf("java");
		System.out.println(i);
		int j = s1.lastIndexOf("java", 11);
		System.out.println(j);
	}
}

/*
 
 OP
 --
 24
 0
 
 lastIndexOf("java")
 searching from right to left
 
 lastIndexOf("java", 11);
 search from 11 index onwards from left to right
 
 
 
 */